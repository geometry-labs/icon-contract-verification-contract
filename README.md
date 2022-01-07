# ICON Contract Verification Contract

Contract used to upload details about a contract to the chain so the source code can be
verified off-chain against what is on-chain. Transactions will be ignored that are not 
sent from the contract owner on the backend that is processing these transactions. 

Berlin: `cx84c88b975f60aeff9ee534b5efdb69d66d239596`

```shell
./gradlew build
./gradlew optimizedJar
```

Deploy:
```shell
goloop rpc sendtx deploy ./contracts/build/libs/contract-verification-0.1.0-optimized.jar \
    --uri https://berlin.net.solidwallet.io/api/v3 \
    --key_store <keystore> --key_password <pw> \
    --nid 7 --step_limit=100000000000 \
    --content_type application/java \
    --param version=v1
```

Send Tx:
```shell
goloop rpc sendtx call \
    --method verify \
    --to cx8a0e64b6b5a84b3f65a9ca12b1e14fe4667ea80b \
    --uri https://berlin.net.solidwallet.io/api/v3 \
    --key_store <keystore> --key_password <pw> \
    --nid 7 --step_limit=100000000000 \
    --param contract_address=cx03f38c36460b2e9ce68a67f83fc9608690b1f64e \
    + <extra params as indicated below, ie -> \
    --param website=geometry.io
```

## Verification Parameters 

- contract_address - The address being verified
- website
- team_name
- short_description
- long_description
- p_rep_address
- city
- country
- license
- facebook
- telegram
- reddit
- discord
- steemit
- twitter
- youtube
- github
- keybase
- wechat
- zipped_source_code - Zipped up source code byte string 


## License 

Apache 2.0

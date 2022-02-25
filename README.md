# ICON Contract Verification Contract

Contract used to upload details about a contract to the chain so the source code can be
verified off-chain against what is on-chain. Transactions will be ignored that are not 
sent from the contract owner on the backend that is processing these transactions. 

Mainnet: `cxfc514c18d8dd85f06e31509a1f231efc5d8939e0`
Berlin: `cx4a574176f82852487b547126b7a59874f5599acd`
Lisbon: `cx59fd09b8fd87ad82961c29c4ff5e44773f629330`

Build: 
```shell
./gradlew optimizedJar
```

Deploy:
```shell
goloop rpc sendtx deploy ./contracts/build/libs/contract-verification-0.1.0-optimized.jar \
    --uri https://berlin.net.solidwallet.io/api/v3 \
    --key_store <keystore> --key_password <pw> \
    --nid 7 --step_limit=1020000000 \
    --content_type application/java \
    --param version=v1
```

Transaction:
```shell
goloop rpc sendtx call \
    --method verify \
    --to cx0744c46c005f254e512ae6b60aacd0a9b06eda1f \
    --uri https://berlin.net.solidwallet.io/api/v3 \
    --key_store keystore-berlin --key_password wy2ukc8.hEE9HJ \
    --nid 7 --step_limit=1000000000 \
    --param contract_address="cx-Contract to be verified" \
    --param website="" \
    --param team_name="" \
    --param short_description="" \
    --param long_description="" \
    --param p_rep_address="" \
    --param city="" \
    --param country="" \
    --param license="" \
    --param facebook="" \
    --param telegram="" \
    --param reddit="" \
    --param discord="" \
    --param steemit="" \
    --param twitter="" \
    --param youtube="" \
    --param github="" \
    --param keybase="" \
    --param wechat="" \
    --param gradle_target="" \
    --param gradle_task="optimizedJar" \
    --param source_code_location="contracts/build/libs/contract-verification-0.1.0-optimized.jar" \
    --param github_org="" \
    --param github_repo="" \
    --param github_directory="" \
    --param github_release="" \
    --param zipped_source_code=0x$HEX
```

## Usage

Please see the [icon-contracts](https://github.com/geometry-labs/icon-contracts) service for more information about how a contract is verified. 

## License 

Apache 2.0

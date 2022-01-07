/*
 * Copyright 2022 Geometry Labs Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.geometry.verification;

import score.Address;
import score.Context;
import score.annotation.External;
import score.annotation.EventLog;

public class ContractVerification {
    private final String version;

    public ContractVerification(String version) {
        this.version = version;
    }

    @External(readonly = true)
    public String name() {
        return "ICON Contract Verification Contract";
    }

    @External(readonly = true)
    public String version() {
        return version;
    }

    @External
    public void verify(
            String contract_address,
            String website,
            String team_name,
            String short_description,
            String long_description,
            String p_rep_address,
            String city,
            String country,
            String license,
            String facebook,
            String telegram,
            String reddit,
            String discord,
            String steemit,
            String twitter,
            String youtube,
            String github,
            String keybase,
            String wechat,
            String zipped_source_code
    ) {
        Address from_address = Context.getCaller();

        // emit Verification event with all the input data acting simply as a pass through
        Verification(
                from_address,
                version,
                contract_address,
                website,
                team_name,
                short_description,
                long_description,
                p_rep_address,
                city,
                country,
                license,
                facebook,
                telegram,
                reddit,
                discord,
                steemit,
                twitter,
                youtube,
                github,
                keybase,
                wechat,
                zipped_source_code
        );
    }

    @EventLog
    protected void Verification(
            Address from_address,
            String version,
            String contract_address,
            String website,
            String team_name,
            String short_description,
            String long_description,
            String p_rep_address,
            String city,
            String country,
            String license,
            String facebook,
            String telegram,
            String reddit,
            String discord,
            String steemit,
            String twitter,
            String youtube,
            String github,
            String keybase,
            String wechat,
            String zipped_source_code
    ) {
    }
}


//        this.contract_address = contract_address;
//                this.email = email;
//                this.website = website;
//                this.team_name = team_name;
//                this.short_description = short_description;
//                this.short_description = short_description;
//                this.p_rep_address = p_rep_address;
//                this.city = city;
//                this.country = country;
//                this.license = license;
//                this.facebook = facebook;
//                this.telegram = telegram;
//                this.reddit = reddit;
//                this.discord = discord;
//                this.steemit = steemit;
//                this.twitter = twitter;
//                this.youtube = youtube;
//                this.github = github;
//                this.keybase = keybase;
//                this.wechat = wechat;
//                this.zipped_source_code = zipped_source_code;

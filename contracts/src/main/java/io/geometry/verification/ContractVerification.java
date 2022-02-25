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

//    Simple pass through so we can collect the Tx inputs
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
            String gradle_target,
            String gradle_task,
            String source_code_location,
            String github_org,
            String github_repo,
            String github_directory,
            String github_release,
            String zipped_source_code
    ) {
        VerificationVersion(this.version);
    }

    @EventLog
    protected void VerificationVersion(
//            Emit an event log for the version when the event happened so we can support evolving schemas
            String version
    ) {
    }
}

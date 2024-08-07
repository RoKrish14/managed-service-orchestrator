/********************************************************************************
#* Copyright (c) 2022,2024 T-Systems International GmbH
#* Copyright (c) 2022,2024 Contributors to the Eclipse Foundation
#*
#* See the NOTICE file(s) distributed with this work for additional
#* information regarding copyright ownership.
#*
#* This program and the accompanying materials are made available under the
#* terms of the Apache License, Version 2.0 which is available at
#* https://www.apache.org/licenses/LICENSE-2.0.
#*
#* Unless required by applicable law or agreed to in writing, software
#* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
#* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
#* License for the specific language governing permissions and limitations
#* under the License.
#*
#* SPDX-License-Identifier: Apache-2.0
#********************************************************************************/

package org.eclipse.tractusx.autosetup.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@ConfigurationProperties(prefix = "sde")
@Configuration
@Data
public class SDEConfigurationProperty {
	
	private String resourceServerIssuer;
	private String keycloakAuth;
	private String keycloakRealm;
	private String keycloakTokenUrl;
	private String keycloakTechnicalClientid;
	private String keycloakTechnicalClientsecret;
	
	private String digitalTwinsHostname;
	private String dtregistryidpClientId;
	private String dtregistrytenantId;
	private String dtregistryUrlPrefix;
	private String dtregistryApiUri;
	
	private String partnerPoolHostname;
	private String portalBackendHostname;
	private String policyhubHostname;
	private String bpndiscoveryHostname;
	
	private String bpdmProviderEdcDspApi;
	private String bpdmProviderBpnl;
	
}

/********************************************************************************
 * Copyright (c) 2022 T-Systems International GmbH
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/

package org.eclipse.tractusx.autosetup.repository;

import org.eclipse.tractusx.autosetup.entity.AutoSetupTriggerEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AutoSetupTriggerEntryRepository extends JpaRepository<AutoSetupTriggerEntry, String> {

	@Query(value = "SELECT * FROM auto_setup_trigger_tbl a WHERE a.trigger_id = ?1", nativeQuery = true)
	AutoSetupTriggerEntry findAllByTriggerId(String triggerId);

	AutoSetupTriggerEntry findTop1ByOrganizationNameAndServiceId(String organizationName, String serviceId);

}

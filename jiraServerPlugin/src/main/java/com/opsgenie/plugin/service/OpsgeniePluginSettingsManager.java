package com.opsgenie.plugin.service;

import com.atlassian.jira.user.ApplicationUser;
import com.opsgenie.plugin.exception.OpsgenieSaveSettingsFailedException;
import com.opsgenie.plugin.exception.OpsgenieUserCreationFailedException;
import com.opsgenie.plugin.model.OpsgeniePluginSettings;

import java.util.Optional;

public interface OpsgeniePluginSettingsManager {

    String OG_PLUGIN_SETTINGS = "com.opsgenie.plugin";
    String SERVER_ID = "serverId";
    String SETUP_ENDPOINT = "/v1/jira-adapter/server/setup";
    String OPSGENIE_USERNAME = "Opsgenie";

    void setServerId(String serverId);

    Optional<String> getServerId();

    Optional<ApplicationUser> getUser();

    String getServerUrl();

    void createOpsgenieConnection(OpsgeniePluginSettings opsgeniePluginSettings) throws OpsgenieUserCreationFailedException;

    Optional<OpsgeniePluginSettings> getSettings();

    void saveSettings(OpsgeniePluginSettings opsgeniePluginSettings) throws OpsgenieSaveSettingsFailedException;

    void updateSettings(OpsgeniePluginSettings opsgeniePluginSettings) throws OpsgenieUserCreationFailedException, OpsgenieSaveSettingsFailedException;

    void deleteSettings(OpsgeniePluginSettings opsgeniePluginSettings);

}

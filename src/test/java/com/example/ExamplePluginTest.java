package com.example;

import com.piggyplugins.profiles.ProfilesPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ProfilesPlugin.class);
		RuneLite.main(args);
	}
}
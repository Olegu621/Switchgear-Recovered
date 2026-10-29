            package com.android.installreferrer.api;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ReferrerDetails {
                private static final String KEY_GOOGLE_PLAY_INSTANT = "google_play_instant";
                private static final String KEY_INSTALL_BEGIN_TIMESTAMP = "install_begin_timestamp_seconds";
                private static final String KEY_INSTALL_BEGIN_TIMESTAMP_SERVER = "install_begin_timestamp_server_seconds";
                private static final String KEY_INSTALL_REFERRER = "install_referrer";
                private static final String KEY_INSTALL_VERSION = "install_version";
                private static final String KEY_REFERRER_CLICK_TIMESTAMP = "referrer_click_timestamp_seconds";
                private static final String KEY_REFERRER_CLICK_TIMESTAMP_SERVER = "referrer_click_timestamp_server_seconds";
                private final Bundle mOriginalBundle;

                public ReferrerDetails(Bundle bundle) {
/* 4 */             this.mOriginalBundle = bundle;
                }

                public boolean getGooglePlayInstantParam() {
/* 5 */             return this.mOriginalBundle.getBoolean(KEY_GOOGLE_PLAY_INSTANT);
                }

                public long getInstallBeginTimestampSeconds() {
/* 5 */             return this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP);
                }

                public long getInstallBeginTimestampServerSeconds() {
/* 5 */             return this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP_SERVER);
                }

                public String getInstallReferrer() {
/* 5 */             return this.mOriginalBundle.getString(KEY_INSTALL_REFERRER);
                }

                public String getInstallVersion() {
/* 5 */             return this.mOriginalBundle.getString(KEY_INSTALL_VERSION);
                }

                public long getReferrerClickTimestampSeconds() {
/* 5 */             return this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP);
                }

                public long getReferrerClickTimestampServerSeconds() {
/* 5 */             return this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP_SERVER);
                }
            }

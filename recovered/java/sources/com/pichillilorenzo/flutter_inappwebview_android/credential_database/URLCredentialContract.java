            package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

            import android.provider.BaseColumns;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class URLCredentialContract {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FeedEntry implements BaseColumns {
                    public static final String COLUMN_NAME_PASSWORD = "password";
                    public static final String COLUMN_NAME_PROTECTION_SPACE_ID = "protection_space_id";
                    public static final String COLUMN_NAME_USERNAME = "username";
                    public static final String TABLE_NAME = "credential";
                }

                private URLCredentialContract() {
                }
            }

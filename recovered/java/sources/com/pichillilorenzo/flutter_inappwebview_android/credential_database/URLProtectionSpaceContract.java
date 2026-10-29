            package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

            import android.provider.BaseColumns;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class URLProtectionSpaceContract {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FeedEntry implements BaseColumns {
                    public static final String COLUMN_NAME_HOST = "host";
                    public static final String COLUMN_NAME_PORT = "port";
                    public static final String COLUMN_NAME_PROTOCOL = "protocol";
                    public static final String COLUMN_NAME_REALM = "realm";
                    public static final String TABLE_NAME = "protection_space";
                }

                private URLProtectionSpaceContract() {
                }
            }

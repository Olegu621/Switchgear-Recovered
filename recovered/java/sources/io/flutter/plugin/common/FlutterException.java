            package io.flutter.plugin.common;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterException extends RuntimeException {
                private static final String TAG = "FlutterException#";
                public final String code;
                public final Object details;

                public FlutterException(String str, String str2, Object obj) {
/* 1 */             super(str2);
/* 4 */             this.code = str;
/* 6 */             this.details = obj;
                }
            }

            package io.flutter.view;

            import io.flutter.embedding.engine.FlutterJNI;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FlutterCallbackInformation {
                public final String callbackClassName;
                public final String callbackLibraryPath;
                public final String callbackName;

                private FlutterCallbackInformation(String str, String str2, String str3) {
/* 4 */             this.callbackName = str;
/* 6 */             this.callbackClassName = str2;
/* 8 */             this.callbackLibraryPath = str3;
                }

                public static FlutterCallbackInformation lookupCallbackInformation(long j) {
/* 1 */             return FlutterJNI.nativeLookupCallbackInformation(j);
                }
            }

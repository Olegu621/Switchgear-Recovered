            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum UserScriptInjectionTime {
                AT_DOCUMENT_START(0),
                AT_DOCUMENT_END(1);

                private final int value;

                UserScriptInjectionTime(int i) {
/* 4 */             this.value = i;
                }

                public static UserScriptInjectionTime fromValue(int i) {
/* 7 */             for (UserScriptInjectionTime userScriptInjectionTime : values()) {
/* 15 */                if (i == userScriptInjectionTime.toValue()) {
/* 17 */                    return userScriptInjectionTime;
                        }
                    }
/* 27 */            C1951n4.m6859j(fm0.m3781g(i, "No enum constant: "));
/* 30 */            return null;
                }

                public boolean equalsValue(int i) {
                    return this.value == i;
                }

                public int toValue() {
/* 1 */             return this.value;
                }
            }

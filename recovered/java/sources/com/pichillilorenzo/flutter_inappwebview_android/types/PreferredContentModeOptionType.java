            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum PreferredContentModeOptionType {
                RECOMMENDED(0),
                MOBILE(1),
                DESKTOP(2);

                private final int value;

                PreferredContentModeOptionType(int i) {
/* 4 */             this.value = i;
                }

                public static PreferredContentModeOptionType fromValue(int i) {
/* 7 */             for (PreferredContentModeOptionType preferredContentModeOptionType : values()) {
/* 15 */                if (i == preferredContentModeOptionType.toValue()) {
/* 17 */                    return preferredContentModeOptionType;
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

            package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum ContentBlockerTriggerResourceType {
                DOCUMENT("document"),
                IMAGE("image"),
                STYLE_SHEET("style-sheet"),
                SCRIPT("script"),
                FONT("font"),
                SVG_DOCUMENT("svg-document"),
                MEDIA("media"),
                POPUP("popup"),
                RAW("raw");

                private final String value;

                ContentBlockerTriggerResourceType(String str) {
/* 4 */             this.value = str;
                }

                public static ContentBlockerTriggerResourceType fromValue(String str) {
/* 7 */             for (ContentBlockerTriggerResourceType contentBlockerTriggerResourceType : values()) {
/* 17 */                if (str.equals(contentBlockerTriggerResourceType.value)) {
/* 19 */                    return contentBlockerTriggerResourceType;
                        }
                    }
/* 29 */            C1951n4.m6859j(AbstractC0886en.m3507k("No enum constant: ", str));
/* 32 */            return null;
                }

                public boolean equalsValue(String str) {
/* 3 */             return this.value.equals(str);
                }

                @Override // java.lang.Enum
                public String toString() {
/* 1 */             return this.value;
                }
            }

            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum hl2 implements InterfaceC2071pi {
                /* JADX INFO: Fake field, exist only in values array */
                VENDOR("TCFVendor"),
                /* JADX INFO: Fake field, exist only in values array */
                STACK("TCFStack"),
                /* JADX INFO: Fake field, exist only in values array */
                SPECIAL_FEATURE("TCFSpecialFeature"),
                /* JADX INFO: Fake field, exist only in values array */
                PURPOSE("TCFPurpose"),
                /* JADX INFO: Fake field, exist only in values array */
                SPECIAL_PURPOSE("TCFSpecialPurpose"),
                /* JADX INFO: Fake field, exist only in values array */
                FEATURE("TCFFeature"),
                /* JADX INFO: Fake field, exist only in values array */
                AD_TECH_PROVIDER("AdTechProvider");


                /* JADX INFO: renamed from: a */
                public final String f9136a;

                hl2(String str) {
/* 4 */             this.f9136a = str;
                }

                @Override // p000.InterfaceC2071pi
                public final String getPrefix() {
/* 1 */             return this.f9136a;
                }
            }

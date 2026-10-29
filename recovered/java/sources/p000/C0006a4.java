            package p000;

            import com.adjust.sdk.Adjust;
            import com.adjust.sdk.AdjustThirdPartySharing;
            
            /* JADX INFO: renamed from: a4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0006a4 extends pg3 {

                /* JADX INFO: renamed from: i */
                public final i03 f77i;

                public C0006a4(i03 i03Var) {
/* 4 */             this.f77i = i03Var;
                }

                /* JADX INFO: renamed from: G */
                public final boolean m51G(boolean z) {
                    try {
/* 3 */                 Class.forName("com.adjust.sdk.Adjust");
/* 6 */                 Adjust.trackMeasurementConsent(z);
/* 9 */                 return true;
                    } catch (Exception e) {
/* 16 */                this.f77i.mo2906a("Failed to apply consent to Adjust", e);
/* 19 */                return false;
                    }
                }

                /* JADX INFO: renamed from: H */
                public final boolean m52H(String str, boolean z) {
                    try {
/* 3 */                 Class.forName("com.adjust.sdk.AdjustThirdPartySharing");
/* 9 */                 AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing((Boolean) null);
/* 14 */                adjustThirdPartySharing.addPartnerSharingSetting(str, "install", z);
/* 19 */                adjustThirdPartySharing.addPartnerSharingSetting(str, "events", z);
/* 24 */                adjustThirdPartySharing.addPartnerSharingSetting(str, "sessions", z);
/* 27 */                Adjust.trackThirdPartySharing(adjustThirdPartySharing);
/* 30 */                return true;
                    } catch (Exception e) {
/* 37 */                this.f77i.mo2906a("Failed to apply consent to Adjust", e);
/* 40 */                return false;
                    }
                }

                /* JADX INFO: renamed from: I */
                public final boolean m53I(cg1 cg1Var) {
                    try {
/* 3 */                 Class.forName("com.adjust.sdk.AdjustThirdPartySharing");
/* 11 */                AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing((Boolean) null);
/* 27 */                adjustThirdPartySharing.addGranularOption("google_dma", "eea", cg1Var.f2889a ? "1" : "0");
/* 39 */                adjustThirdPartySharing.addGranularOption("google_dma", "ad_personalization", cg1Var.f2893e ? "1" : "0");
/* 49 */                adjustThirdPartySharing.addGranularOption("google_dma", "ad_user_data", cg1Var.f2892d ? "1" : "0");
/* 52 */                Adjust.trackThirdPartySharing(adjustThirdPartySharing);
/* 55 */                return true;
                    } catch (Exception e) {
/* 62 */                this.f77i.mo2906a("Failed to apply consent to Adjust", e);
/* 65 */                return false;
                    }
                }
            }

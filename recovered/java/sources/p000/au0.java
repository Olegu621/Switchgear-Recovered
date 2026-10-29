            package p000;

            import android.webkit.JavascriptInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class au0 {

                /* JADX INFO: renamed from: a */
                public ra2 f2093a;

                @JavascriptInterface
                public void closeHelpcenter() {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event to close Helpcenter", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 21 */            ((ra2) ra2Var.f15957c).m8115t(new us0(ra2Var, 2));
                }

                @JavascriptInterface
                public void getWebchatData() {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event to getWCLocalStorageData from HC WebView.", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 21 */            ((ra2) ra2Var.f15957c).m8116u(new us0(ra2Var, 1));
                }

                @JavascriptInterface
                public void hcActionSync(String str) {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event to ActionSync from HC WebView.", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 21 */            ((ra2) ra2Var.f15957c).m8116u(new vs0(ra2Var, str, 0));
                }

                @JavascriptInterface
                public void helpcenterLoaded(String str) {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event helpcenter loaded", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 13 */            ra2 ra2Var2 = (ra2) ra2Var.f15957c;
/* 21 */            ra2Var2.m8115t(new ws0(ra2Var, str, 1));
/* 30 */            ra2Var2.m8116u(new vs0(ra2Var, str, 2));
                }

                @JavascriptInterface
                public void onHelpcenterError() {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event helpcenter error", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 13 */            ra2 ra2Var2 = (ra2) ra2Var.f15957c;
/* 21 */            ra2Var2.m8116u(new us0(ra2Var, 0));
/* 30 */            ra2Var2.m8115t(new us0(ra2Var, 4));
                }

                @JavascriptInterface
                public void openWebchat() {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event to open Webchat", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 21 */            ((ra2) ra2Var.f15957c).m8115t(new us0(ra2Var, 3));
                }

                @JavascriptInterface
                public void removeAdditionalInfo(String str) {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event to remove additional Helpcenter data from HC WebView.", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 21 */            ((ra2) ra2Var.f15957c).m8116u(new vs0(ra2Var, str, 1));
                }

                @JavascriptInterface
                public void setAdditionalInfo(String str) {
/* 6 */             xe2.m9775m("HelpcnterToNatve", "Received event to set additional Helpcenter data from HC WebView.", null);
/* 9 */             ra2 ra2Var = this.f2093a;
/* 21 */            ((ra2) ra2Var.f15957c).m8116u(new ws0(ra2Var, str, 0));
                }
            }

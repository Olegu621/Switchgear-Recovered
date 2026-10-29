            package p000;

            import android.text.TextUtils;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class in3 implements InterfaceC0172b9, InterfaceC2526z8 {

                /* JADX INFO: renamed from: a */
                public final int f9729a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f9730b;

                /* JADX INFO: renamed from: c */
                public final GoogleSignInAccount f9731c;

                /* JADX INFO: renamed from: d */
                public final String f9732d;

                /* JADX INFO: renamed from: e */
                public final nl3 f9733e;

                public /* synthetic */ in3(int i, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, String str, nl3 nl3Var) {
/* 4 */             this.f9729a = i;
/* 6 */             this.f9730b = arrayList;
/* 8 */             this.f9731c = googleSignInAccount;
/* 10 */            this.f9732d = str;
/* 12 */            this.f9733e = nl3Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 60 */                return true;
                    }
/* 6 */             if (!(obj instanceof in3)) {
/* 62 */                return false;
                    }
/* 9 */             in3 in3Var = (in3) obj;
/* 15 */            if (this.f9729a != in3Var.f9729a || !this.f9730b.equals(in3Var.f9730b)) {
/* 62 */                return false;
                    }
/* 27 */            GoogleSignInAccount googleSignInAccount = in3Var.f9731c;
/* 29 */            GoogleSignInAccount googleSignInAccount2 = this.f9731c;
/* 31 */            if (googleSignInAccount2 == null) {
/* 33 */                if (googleSignInAccount != null) {
/* 62 */                    return false;
                        }
                    } else if (!googleSignInAccount2.equals(googleSignInAccount)) {
/* 62 */                return false;
                    }
                    return TextUtils.equals(null, null) && de3.m3029k(this.f9732d, in3Var.f9732d);
                }

                public final int hashCode() {
/* 19 */            int iHashCode = (this.f9730b.hashCode() + ((this.f9729a + 486741695) * 961)) * 923521;
/* 21 */            GoogleSignInAccount googleSignInAccount = this.f9731c;
/* 36 */            int iHashCode2 = (((iHashCode + (googleSignInAccount == null ? 0 : googleSignInAccount.hashCode())) * 29791) + 9) * 31;
/* 38 */            String str = this.f9732d;
/* 47 */            return iHashCode2 + (str != null ? str.hashCode() : 0);
                }
            }

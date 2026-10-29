            package p000;

            import android.content.ClipData;
            import android.net.Uri;
            import android.os.Bundle;
            import android.view.ContentInfo;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 59 */    public final class j00 implements i00, k00 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11979a = 0;

                /* JADX INFO: renamed from: b */
                public ClipData f11980b;

                /* JADX INFO: renamed from: c */
                public int f11981c;

                /* JADX INFO: renamed from: d */
                public int f11982d;

                /* JADX INFO: renamed from: e */
                public Uri f11983e;

                /* JADX INFO: renamed from: f */
                public Bundle f11984f;

                public j00(j00 j00Var) {
/* 7 */             ClipData clipData = j00Var.f11980b;
/* 9 */             clipData.getClass();
/* 12 */            this.f11980b = clipData;
/* 14 */            int i = j00Var.f11981c;
/* 20 */            de3.m3025g(FirebaseAnalytics.Param.SOURCE, i, 0, 5);
/* 23 */            this.f11981c = i;
/* 25 */            int i2 = j00Var.f11982d;
/* 29 */            if ((i2 & 1) != i2) {
/* 56 */                ds0.m3197n("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
/* 60 */                throw null;
                    }
/* 31 */            this.f11982d = i2;
/* 35 */            this.f11983e = j00Var.f11983e;
/* 39 */            this.f11984f = j00Var.f11984f;
                }

                @Override // p000.k00
                /* JADX INFO: renamed from: a */
                public ClipData mo5628a() {
/* 1 */             return this.f11980b;
                }

                @Override // p000.k00
                /* JADX INFO: renamed from: b */
                public ContentInfo mo5629b() {
/* 1 */             return null;
                }

                @Override // p000.i00
                public l00 build() {
/* 8 */             return new l00(new j00(this));
                }

                @Override // p000.i00
                /* JADX INFO: renamed from: d */
                public void mo3992d(Uri uri) {
/* 1 */             this.f11983e = uri;
                }

                @Override // p000.k00
                /* JADX INFO: renamed from: e */
                public int mo5630e() {
/* 1 */             return this.f11981c;
                }

                @Override // p000.k00
                public int getFlags() {
/* 1 */             return this.f11982d;
                }

                @Override // p000.i00
                public void setExtras(Bundle bundle) {
/* 1 */             this.f11984f = bundle;
                }

                @Override // p000.i00
                public void setFlags(int i) {
/* 1 */             this.f11982d = i;
                }

                public String toString() {
                    String strValueOf;
                    String str;
                    switch (this.f11979a) {
                        case 1:
/* 11 */                    Uri uri = this.f11983e;
/* 17 */                    StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
/* 26 */                    sb.append(this.f11980b.getDescription());
/* 31 */                    sb.append(", source=");
/* 34 */                    int i = this.f11981c;
/* 36 */                    if (i == 0) {
/* 73 */                        strValueOf = "SOURCE_APP";
                            } else if (i == 1) {
/* 70 */                        strValueOf = "SOURCE_CLIPBOARD";
                            } else if (i == 2) {
/* 67 */                        strValueOf = "SOURCE_INPUT_METHOD";
                            } else if (i == 3) {
/* 64 */                        strValueOf = "SOURCE_DRAG_AND_DROP";
                            } else if (i != 4) {
/* 58 */                        strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                            } else {
/* 61 */                        strValueOf = "SOURCE_AUTOFILL";
                            }
/* 75 */                    sb.append(strValueOf);
/* 80 */                    sb.append(", flags=");
/* 83 */                    int i2 = this.f11982d;
/* 96 */                    sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
/* 99 */                    String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 101 */                   if (uri == null) {
/* 103 */                       str = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
/* 128 */                       str = ", hasLinkUri(" + uri.toString().length() + ")";
                            }
/* 132 */                   sb.append(str);
/* 137 */                   if (this.f11984f != null) {
/* 140 */                       str2 = ", hasExtras";
                            }
/* 144 */                   return fm0.m3789o(sb, str2, "}");
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 60 */        public /* synthetic */ j00() {
                }
            }

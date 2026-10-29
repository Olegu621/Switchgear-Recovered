            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCategory;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: xr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2471xr {

                /* JADX INFO: renamed from: a */
                public final UsercentricsCategory f19328a;

                /* JADX INFO: renamed from: b */
                public final boolean f19329b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f19330c;

                public C2471xr(UsercentricsCategory usercentricsCategory, boolean z, ArrayList arrayList) {
/* 4 */             this.f19328a = usercentricsCategory;
/* 6 */             this.f19329b = z;
/* 8 */             this.f19330c = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2471xr)) {
/* 39 */                return false;
                    }
/* 9 */             C2471xr c2471xr = (C2471xr) obj;
                    return this.f19328a.equals(c2471xr.f19328a) && this.f19329b == c2471xr.f19329b && this.f19330c.equals(c2471xr.f19330c);
                }

                public final int hashCode() {
/* 22 */            return this.f19330c.hashCode() + AbstractC0886en.m3504h(this.f19328a.hashCode() * 31, 31, this.f19329b);
                }

                public final String toString() {
/* 38 */            return "CategoryProps(category=" + this.f19328a + ", checked=" + this.f19329b + ", services=" + this.f19330c + ")";
                }
            }

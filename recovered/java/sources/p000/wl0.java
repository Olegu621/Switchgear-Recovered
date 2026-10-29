            package p000;

            import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
            import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
            import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public final class wl0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18679a;

                /* JADX INFO: renamed from: b */
                public boolean f18680b;

                /* JADX INFO: renamed from: c */
                public boolean f18681c;

                /* JADX INFO: renamed from: d */
                public boolean f18682d;

                public wl0(er0 er0Var, er0 er0Var2) {
/* 2 */             this.f18679a = 0;
/* 13 */            this.f18680b = er0Var2.m3579d(TextureViewIsClosedQuirk.class);
/* 21 */            this.f18681c = er0Var.m3579d(PreviewOrientationIncorrectQuirk.class);
/* 29 */            this.f18682d = er0Var.m3579d(ConfigureSurfaceToSecondarySessionFailQuirk.class);
                }

                /* JADX INFO: renamed from: a */
                public void m9585a(ArrayList arrayList) {
/* 3 */             if ((this.f18680b || this.f18681c || this.f18682d) && arrayList != null) {
/* 15 */                Iterator it = arrayList.iterator();
/* 23 */                while (it.hasNext()) {
/* 31 */                    ((d70) it.next()).mo2951a();
                        }
/* 37 */                hu0.m4312F0("ForceCloseDeferrableSurface");
                    }
                }

                public String toString() {
                    switch (this.f18679a) {
                        case 1:
/* 15 */                    StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
/* 20 */                    sb.append(this.f18680b);
/* 25 */                    sb.append(", ignoreUnknownKeys=");
/* 30 */                    sb.append(this.f18681c);
/* 35 */                    sb.append(", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='    ', coerceInputValues=");
/* 42 */                    return AbstractC0886en.m3511o(sb, this.f18682d, ", useArrayPolymorphism=false, classDiscriminator='type', allowSpecialFloatingPointValues=false)");
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 31 */        public wl0(boolean z, boolean z2, boolean z3) {
                    this.f18679a = 1;
/* 33 */            this.f18680b = z;
/* 34 */            this.f18681c = z2;
/* 35 */            this.f18682d = z3;
                }

/* 35 */        public /* synthetic */ wl0() {
                    this.f18679a = 2;
                    this.f18680b = false;
                    this.f18681c = false;
                    this.f18682d = false;
                }
            }

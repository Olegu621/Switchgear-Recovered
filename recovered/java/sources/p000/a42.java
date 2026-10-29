            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a42 {

                /* JADX INFO: renamed from: a */
                public final ColorStateList f79a;

                /* JADX INFO: renamed from: b */
                public final Configuration f80b;

                /* JADX INFO: renamed from: c */
                public final int f81c;

                public a42(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
/* 4 */             this.f79a = colorStateList;
/* 6 */             this.f80b = configuration;
/* 16 */            this.f81c = theme == null ? 0 : theme.hashCode();
                }
            }

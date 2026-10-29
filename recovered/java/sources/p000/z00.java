            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.AssetManager;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.os.Build;
            import android.view.LayoutInflater;
            import androidx.appcompat.R$style;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z00 extends ContextWrapper {

                /* JADX INFO: renamed from: f */
                public static Configuration f19887f;

                /* JADX INFO: renamed from: a */
                public int f19888a;

                /* JADX INFO: renamed from: b */
                public Resources.Theme f19889b;

                /* JADX INFO: renamed from: c */
                public LayoutInflater f19890c;

                /* JADX INFO: renamed from: d */
                public Configuration f19891d;

                /* JADX INFO: renamed from: e */
                public Resources f19892e;

                public z00(Context context, int i) {
/* 1 */             super(context);
/* 4 */             this.f19888a = i;
                }

                /* JADX INFO: renamed from: a */
                public final void m10231a(Configuration configuration) {
/* 3 */             if (this.f19892e != null) {
/* 25 */                f42.m3656l("getResources() or getAssets() has already been called");
                    } else if (this.f19891d == null) {
/* 14 */                this.f19891d = new Configuration(configuration);
                    } else {
/* 19 */                f42.m3656l("Override configuration has already been set");
                    }
                }

                @Override // android.content.ContextWrapper
                public final void attachBaseContext(Context context) {
/* 1 */             super.attachBaseContext(context);
                }

                /* JADX INFO: renamed from: b */
                public final void m10232b() {
/* 3 */             if (this.f19889b == null) {
/* 13 */                this.f19889b = getResources().newTheme();
/* 19 */                Resources.Theme theme = getBaseContext().getTheme();
/* 23 */                if (theme != null) {
/* 27 */                    this.f19889b.setTo(theme);
                        }
                    }
/* 35 */            this.f19889b.applyStyle(this.f19888a, true);
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public final AssetManager getAssets() {
/* 5 */             return getResources().getAssets();
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0032  */
                @Override // android.content.ContextWrapper, android.content.Context
                public final Resources getResources() {
/* 3 */             if (this.f19892e == null) {
/* 5 */                 Configuration configuration = this.f19891d;
/* 7 */                 if (configuration == null) {
/* 55 */                    this.f19892e = super.getResources();
                        } else {
/* 13 */                    if (Build.VERSION.SDK_INT >= 26) {
/* 17 */                        if (f19887f == null) {
/* 21 */                            Configuration configuration2 = new Configuration();
/* 25 */                            configuration2.fontScale = 0.0f;
/* 27 */                            f19887f = configuration2;
                                }
/* 35 */                        if (configuration.equals(f19887f)) {
/* 55 */                            this.f19892e = super.getResources();
                                }
                            }
/* 48 */                    this.f19892e = createConfigurationContext(this.f19891d).getResources();
                        }
                    }
/* 57 */            return this.f19892e;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public final Object getSystemService(String str) {
/* 7 */             if (!"layout_inflater".equals(str)) {
/* 34 */                return getBaseContext().getSystemService(str);
                    }
/* 11 */            if (this.f19890c == null) {
/* 25 */                this.f19890c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                    }
/* 27 */            return this.f19890c;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public final Resources.Theme getTheme() {
/* 1 */             Resources.Theme theme = this.f19889b;
/* 3 */             if (theme != null) {
/* 5 */                 return theme;
                    }
/* 8 */             if (this.f19888a == 0) {
/* 12 */                this.f19888a = R$style.Theme_AppCompat_Light;
                    }
/* 14 */            m10232b();
/* 17 */            return this.f19889b;
                }

                @Override // android.content.ContextWrapper, android.content.Context
                public final void setTheme(int i) {
/* 3 */             if (this.f19888a != i) {
/* 5 */                 this.f19888a = i;
/* 7 */                 m10232b();
                    }
                }
            }

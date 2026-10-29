            package p000;

            import android.util.Size;
            import io.flutter.plugin.platform.PlatformPlugin;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ue2 {

                /* JADX INFO: renamed from: a */
                public static final Size f17489a = new Size(0, 0);

                /* JADX INFO: renamed from: b */
                public static final Size f17490b;

                /* JADX INFO: renamed from: c */
                public static final Size f17491c;

                /* JADX INFO: renamed from: d */
                public static final Size f17492d;

                /* JADX INFO: renamed from: e */
                public static final Size f17493e;

                /* JADX INFO: renamed from: f */
                public static final Size f17494f;

                static {
/* 15 */            new Size(320, 240);
/* 27 */            f17490b = new Size(640, 480);
/* 36 */            f17491c = new Size(720, 480);
/* 45 */            f17492d = new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720);
/* 56 */            f17493e = new Size(1920, 1080);
/* 65 */            f17494f = new Size(1920, 1440);
                }

                /* JADX INFO: renamed from: a */
                public static int m9005a(Size size) {
/* 9 */             return size.getHeight() * size.getWidth();
                }
            }

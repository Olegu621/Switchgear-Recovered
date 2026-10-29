            package androidx.camera.camera2.internal.compat.quirk;

            import android.util.Pair;
            import java.util.HashSet;
            import java.util.Locale;
            import p000.h02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlashAvailabilityBufferUnderflowQuirk implements h02 {

                /* JADX INFO: renamed from: a */
                public static final HashSet f787a;

                static {
/* 3 */             HashSet hashSet = new HashSet();
/* 6 */             f787a = hashSet;
/* 10 */            Locale locale = Locale.US;
/* 27 */            hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
/* 45 */            hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
                }
            }

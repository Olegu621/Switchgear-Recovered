            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.Context;
            import kotlin.jvm.functions.Function1;
            import p000.vo0;
            
            /* JADX INFO: renamed from: com.supercell.id.scid_plugin.platform_interface.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C0786b extends vo0 implements Function1 {

                /* JADX INFO: renamed from: a */
                public static final C0786b f5706a = new C0786b(1, SharedDataWhitelist.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             Context context = (Context) obj;
/* 3 */             context.getClass();
/* 9 */             return new SharedDataWhitelist(context, null);
                }
            }

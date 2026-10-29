            package com.supercell.p007id.scid_plugin;

            import android.content.Context;
            import kotlin.jvm.functions.Function1;
            import p000.vo0;
            
            /* JADX INFO: renamed from: com.supercell.id.scid_plugin.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C0784c extends vo0 implements Function1 {

                /* JADX INFO: renamed from: a */
                public static final C0784c f5702a = new C0784c(1, SharedDataStorage.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             Context context = (Context) obj;
/* 3 */             context.getClass();
/* 9 */             return new SharedDataStorage(context, null);
                }
            }

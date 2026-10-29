            package io.flutter.plugins.sharedpreferences;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            import p000.c10;
            import p000.f42;
            import p000.j50;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)Ljava/util/Map;"}, m6177k = 3, m6178mv = {2, 1, 0})
            @j50(m5707c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getKeys$prefs$1", m5708f = "SharedPreferencesPlugin.kt", m5709l = {248}, m5710m = "invokeSuspend")
            public final class SharedPreferencesPlugin$getKeys$prefs$1 extends tj2 implements Function2<y10, c10, Object> {
                final /* synthetic */ List<String> $allowList;
                int label;
                final /* synthetic */ SharedPreferencesPlugin this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SharedPreferencesPlugin$getKeys$prefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, List<String> list, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.this$0 = sharedPreferencesPlugin;
/* 3 */             this.$allowList = list;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new SharedPreferencesPlugin$getKeys$prefs$1(this.this$0, this.$allowList, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */             return ((SharedPreferencesPlugin$getKeys$prefs$1) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.label;
/* 6 */             if (i != 0) {
/* 8 */                 if (i == 1) {
/* 10 */                    pg3.m7417A(obj);
/* 13 */                    return obj;
                        }
/* 16 */                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                return null;
                    }
/* 21 */            pg3.m7417A(obj);
/* 24 */            SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
/* 26 */            List<String> list = this.$allowList;
/* 28 */            this.label = 1;
/* 1 */             Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
                    return prefs == z10Var ? z10Var : prefs;
                }
            }

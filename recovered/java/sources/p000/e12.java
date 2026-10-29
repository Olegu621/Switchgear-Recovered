            package p000;

            import android.os.Bundle;
            import java.lang.reflect.Constructor;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e12 implements d71 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7473a;

                /* JADX INFO: renamed from: b */
                public final Object f7474b;

                public /* synthetic */ e12(Object obj, int i) {
/* 1 */             this.f7473a = i;
/* 3 */             this.f7474b = obj;
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 1 */             int i = this.f7473a;
/* 4 */             Object obj = this.f7474b;
                    switch (i) {
                        case 0:
/* 71 */                    z62 z62Var = (z62) obj;
/* 75 */                    if (t61Var != t61.ON_CREATE) {
/* 309 */                       C1951n4.m6856g("Next event must be ON_CREATE");
/* 312 */                       return;
                            }
/* 81 */                    g71Var.getLifecycle().mo4484b(this);
/* 90 */                    Bundle bundleM9722a = z62Var.getSavedStateRegistry().m9722a("androidx.savedstate.Restarter");
/* 94 */                    if (bundleM9722a == null) {
/* 312 */                       return;
                            }
/* 100 */                   ArrayList<String> stringArrayList = bundleM9722a.getStringArrayList("classes_to_restore");
/* 104 */                   if (stringArrayList == null) {
/* 303 */                       f42.m3656l("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
/* 312 */                       return;
                            }
/* 114 */                   for (String str : stringArrayList) {
                                try {
/* 136 */                           Class<? extends U> clsAsSubclass = Class.forName(str, false, e12.class.getClassLoader()).asSubclass(v62.class);
/* 140 */                           clsAsSubclass.getClass();
                                    try {
/* 143 */                               Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
/* 148 */                               declaredConstructor.setAccessible(true);
                                        try {
/* 151 */                                   Object objNewInstance = declaredConstructor.newInstance(null);
/* 155 */                                   objNewInstance.getClass();
/* 162 */                                   if (!(z62Var instanceof u33)) {
/* 247 */                                       f42.m3656l("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
/* 312 */                                       return;
                                            }
/* 167 */                                   t33 viewModelStore = ((u33) z62Var).getViewModelStore();
/* 171 */                                   x62 savedStateRegistry = z62Var.getSavedStateRegistry();
/* 175 */                                   viewModelStore.getClass();
/* 178 */                                   LinkedHashMap linkedHashMap = viewModelStore.f16912a;
/* 197 */                                   for (String str2 : new HashSet(linkedHashMap.keySet())) {
/* 205 */                                       str2.getClass();
/* 212 */                                       q33 q33Var = (q33) linkedHashMap.get(str2);
/* 214 */                                       q33Var.getClass();
/* 221 */                                       w11.m9421c(q33Var, savedStateRegistry, z62Var.getLifecycle());
                                            }
/* 238 */                                   if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
/* 240 */                                       savedStateRegistry.m9725d();
                                            }
                                        } catch (Exception e) {
/* 258 */                                   ds0.m3198o(AbstractC0886en.m3507k("Failed to instantiate ", str), e);
/* 312 */                                   return;
                                        }
                                    } catch (NoSuchMethodException e2) {
/* 289 */                               throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
/* 297 */                           ds0.m3198o(fm0.m3784j("Class ", str, " wasn't found"), e3);
/* 312 */                           return;
                                }
                            }
/* 312 */                   return;
                        case 1:
/* 53 */                    new HashMap();
/* 56 */                    lq0[] lq0VarArr = (lq0[]) obj;
/* 59 */                    if (lq0VarArr.length > 0) {
/* 68 */                        lq0 lq0Var = lq0VarArr[0];
/* 70 */                        throw null;
                            }
/* 62 */                    if (lq0VarArr.length <= 0) {
/* 64 */                        return;
                            }
/* 65 */                    lq0 lq0Var2 = lq0VarArr[0];
/* 67 */                    throw null;
                        default:
/* 12 */                    if (t61Var != t61.ON_CREATE) {
/* 50 */                        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + t61Var).toString());
                            }
/* 18 */                    g71Var.getLifecycle().mo4484b(this);
/* 23 */                    ((s62) obj).m8416b();
/* 26 */                    return;
                    }
                }
            }

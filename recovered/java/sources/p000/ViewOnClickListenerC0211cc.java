            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import android.view.View;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: cc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnClickListenerC0211cc implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final View f2833a;

                /* JADX INFO: renamed from: b */
                public final String f2834b;

                /* JADX INFO: renamed from: c */
                public Method f2835c;

                /* JADX INFO: renamed from: d */
                public Context f2836d;

                public ViewOnClickListenerC0211cc(View view, String str) {
/* 4 */             this.f2833a = view;
/* 6 */             this.f2834b = str;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    Method method;
/* 3 */             if (this.f2835c != null) {
                        break;
                    }
/* 5 */             View view2 = this.f2833a;
/* 7 */             Context context = view2.getContext();
                    while (true) {
/* 11 */                String str2 = this.f2834b;
/* 13 */                if (context == null) {
/* 55 */                    int id = view2.getId();
/* 60 */                    if (id == -1) {
/* 62 */                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
/* 92 */                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                            }
/* 102 */                   StringBuilder sbM3513q = AbstractC0886en.m3513q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
/* 110 */                   sbM3513q.append(view2.getClass());
/* 113 */                   sbM3513q.append(str);
/* 123 */                   throw new IllegalStateException(sbM3513q.toString());
                        }
                        try {
/* 19 */                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
/* 37 */                        this.f2835c = method;
/* 39 */                        this.f2836d = context;
                                break;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
/* 53 */                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                    }
                    try {
/* 132 */               this.f2835c.invoke(this.f2836d, view);
                    } catch (IllegalAccessException e) {
/* 153 */               throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
                    } catch (InvocationTargetException e2) {
/* 144 */               throw new IllegalStateException("Could not execute method for android:onClick", e2);
                    }
                }
            }

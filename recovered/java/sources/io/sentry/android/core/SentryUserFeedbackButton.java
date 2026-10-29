            package io.sentry.android.core;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.View;
            import android.widget.Button;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            import p000.h51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 7 */     public class SentryUserFeedbackButton extends Button {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f9892b = 0;

                /* JADX INFO: renamed from: a */
                public View.OnClickListener f9893a;

                @Deprecated
                public SentryUserFeedbackButton(Context context, AttributeSet attributeSet) throws Exception {
/* 1 */             super(context, attributeSet);
/* 5 */             m4760a(context, attributeSet, 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final void m4760a(Context context, AttributeSet attributeSet, int i) throws Exception {
                    boolean zIsTerminated;
                    boolean zIsTerminated2;
/* 3 */             TimeUnit timeUnit = TimeUnit.DAYS;
/* 7 */             boolean z = false;
/* 14 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SentryUserFeedbackButton, i, 0);
                    try {
/* 27 */                float f = context.getResources().getDisplayMetrics().density;
/* 33 */                float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.SentryUserFeedbackButton_android_drawablePadding, -1.0f);
/* 40 */                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SentryUserFeedbackButton_android_drawableStart, -1);
/* 46 */                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SentryUserFeedbackButton_android_textAllCaps, false);
/* 52 */                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SentryUserFeedbackButton_android_background, -1);
/* 58 */                float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.SentryUserFeedbackButton_android_padding, -1.0f);
/* 66 */                int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SentryUserFeedbackButton_android_textColor, -1);
/* 72 */                String string = typedArrayObtainStyledAttributes.getString(R$styleable.SentryUserFeedbackButton_android_text);
/* 78 */                if (dimension == -1.0f) {
/* 84 */                    setCompoundDrawablePadding((int) (4.0f * f));
                        }
/* 92 */                if (resourceId == -1) {
/* 96 */                    setCompoundDrawablesRelativeWithIntrinsicBounds(R$drawable.sentry_user_feedback_button_logo_24, 0, 0, 0);
                        }
/* 99 */                setAllCaps(z2);
/* 102 */               if (resourceId2 == -1) {
/* 106 */                   setBackgroundResource(R$drawable.sentry_oval_button_ripple_background);
                        }
/* 111 */               if (dimension2 == -1.0f) {
/* 116 */                   int i2 = (int) (f * 12.0f);
/* 117 */                   setPadding(i2, i2, i2, i2);
                        }
/* 120 */               if (color == -1) {
/* 124 */                   TypedValue typedValue = new TypedValue();
/* 134 */                   context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
/* 151 */                   setTextColor(context.getResources().getColor(typedValue.resourceId, context.getTheme()));
                        }
/* 154 */               if (string == null) {
/* 158 */                   setText("Report a Bug");
                        }
/* 163 */               if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
/* 167 */                   typedArrayObtainStyledAttributes.close();
                        } else if (typedArrayObtainStyledAttributes instanceof ExecutorService) {
/* 175 */                   ExecutorService executorService = (ExecutorService) typedArrayObtainStyledAttributes;
/* 181 */                   if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
/* 190 */                       executorService.shutdown();
/* 193 */                       while (!zIsTerminated2) {
                                    try {
/* 197 */                               zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                    } catch (InterruptedException unused) {
/* 202 */                               if (!z) {
/* 204 */                                   executorService.shutdownNow();
/* 207 */                                   z = true;
                                        }
                                    }
                                }
/* 209 */                       if (z) {
/* 215 */                           Thread.currentThread().interrupt();
                                }
                            }
                        } else {
/* 219 */                   typedArrayObtainStyledAttributes.recycle();
                        }
/* 224 */               setOnClickListener(this.f9893a);
                    } catch (Throwable th) {
/* 228 */               if (typedArrayObtainStyledAttributes == 0) {
/* 295 */                   throw th;
                        }
                        try {
/* 232 */                   if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
/* 287 */                       typedArrayObtainStyledAttributes.close();
/* 295 */                       throw th;
                            }
/* 236 */                   if (!(typedArrayObtainStyledAttributes instanceof ExecutorService)) {
/* 281 */                       typedArrayObtainStyledAttributes.recycle();
/* 295 */                       throw th;
                            }
/* 238 */                   ExecutorService executorService2 = (ExecutorService) typedArrayObtainStyledAttributes;
/* 244 */                   if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
/* 295 */                       throw th;
                            }
/* 252 */                   executorService2.shutdown();
/* 255 */                   while (!zIsTerminated) {
                                try {
/* 259 */                           zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                                } catch (InterruptedException unused2) {
/* 264 */                           if (!z) {
/* 266 */                               executorService2.shutdownNow();
/* 269 */                               z = true;
                                    }
                                }
                            }
/* 271 */                   if (!z) {
/* 295 */                       throw th;
                            }
/* 277 */                   Thread.currentThread().interrupt();
/* 295 */                   throw th;
                        } catch (Throwable th2) {
/* 292 */                   th.addSuppressed(th2);
/* 295 */                   throw th;
                        }
                    }
                }

                @Override // android.view.View
                public void setOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             this.f9893a = onClickListener;
/* 9 */             super.setOnClickListener(new h51(this, 6));
                }

                @Deprecated
/* 8 */         public SentryUserFeedbackButton(Context context, AttributeSet attributeSet, int i) throws Exception {
/* 9 */             super(context, attributeSet, i);
/* 10 */            m4760a(context, attributeSet, i);
                }
            }

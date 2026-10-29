            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.Xml;
            import android.view.View;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.C0076c;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e53 {

                /* JADX INFO: renamed from: a */
                public int f7526a;

                /* JADX INFO: renamed from: e */
                public int f7530e;

                /* JADX INFO: renamed from: f */
                public final m31 f7531f;

                /* JADX INFO: renamed from: g */
                public final C0076c f7532g;

                /* JADX INFO: renamed from: j */
                public int f7535j;

                /* JADX INFO: renamed from: k */
                public String f7536k;

                /* JADX INFO: renamed from: o */
                public final Context f7540o;

                /* JADX INFO: renamed from: b */
                public int f7527b = -1;

                /* JADX INFO: renamed from: c */
                public boolean f7528c = false;

                /* JADX INFO: renamed from: d */
                public int f7529d = 0;

                /* JADX INFO: renamed from: h */
                public int f7533h = -1;

                /* JADX INFO: renamed from: i */
                public int f7534i = -1;

                /* JADX INFO: renamed from: l */
                public int f7537l = 0;

                /* JADX INFO: renamed from: m */
                public String f7538m = null;

                /* JADX INFO: renamed from: n */
                public int f7539n = -1;

                /* JADX INFO: renamed from: p */
                public int f7541p = -1;

                /* JADX INFO: renamed from: q */
                public int f7542q = -1;

                /* JADX INFO: renamed from: r */
                public int f7543r = -1;

                /* JADX INFO: renamed from: s */
                public int f7544s = -1;

                /* JADX INFO: renamed from: t */
                public int f7545t = -1;

                /* JADX INFO: renamed from: u */
                public int f7546u = -1;

                /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: IOException -> 0x00c8, XmlPullParserException -> 0x00cd, TryCatch #2 {IOException -> 0x00c8, XmlPullParserException -> 0x00cd, blocks: (B:3:0x0024, B:11:0x0035, B:33:0x00c2, B:14:0x0041, B:15:0x0049, B:32:0x008f, B:17:0x004d, B:22:0x005e, B:20:0x0056, B:23:0x0066, B:25:0x006c, B:26:0x0070, B:28:0x0078, B:29:0x0080, B:31:0x0088), top: B:40:0x0024 }] */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Instruction removed from duplicated block: B:32:0x008f, please report this as an issue */
                public e53(Context context, XmlResourceParser xmlResourceParser) {
/* 35 */            this.f7540o = context;
                    try {
/* 37 */                int eventType = xmlResourceParser.getEventType();
/* 42 */                while (eventType != 1) {
/* 47 */                    if (eventType == 2) {
/* 66 */                        String name = xmlResourceParser.getName();
                                switch (name.hashCode()) {
                                    case -1962203927:
/* 135 */                               if (!name.equals("ConstraintOverride")) {
/* 168 */                                   AbstractC1245n0.m4876d("ViewTransition", de3.m3037s() + " unknown tag " + name);
/* 173 */                                   StringBuilder sb = new StringBuilder();
/* 178 */                                   sb.append(".xml:");
/* 185 */                                   sb.append(xmlResourceParser.getLineNumber());
/* 192 */                                   AbstractC1245n0.m4876d("ViewTransition", sb.toString());
                                        } else {
/* 141 */                                   this.f7532g = C0077d.m529d(context, xmlResourceParser);
                                        }
                                        break;
                                    case -1239391468:
/* 119 */                               if (!name.equals("KeyFrameSet")) {
/* 168 */                                   AbstractC1245n0.m4876d("ViewTransition", de3.m3037s() + " unknown tag " + name);
/* 173 */                                   StringBuilder sb2 = new StringBuilder();
/* 178 */                                   sb2.append(".xml:");
/* 185 */                                   sb2.append(xmlResourceParser.getLineNumber());
/* 192 */                                   AbstractC1245n0.m4876d("ViewTransition", sb2.toString());
                                        } else {
/* 126 */                                   this.f7531f = new m31(context, xmlResourceParser);
                                        }
                                        break;
                                    case 61998586:
/* 107 */                               if (!name.equals("ViewTransition")) {
/* 168 */                                   AbstractC1245n0.m4876d("ViewTransition", de3.m3037s() + " unknown tag " + name);
/* 173 */                                   StringBuilder sb3 = new StringBuilder();
/* 178 */                                   sb3.append(".xml:");
/* 185 */                                   sb3.append(xmlResourceParser.getLineNumber());
/* 192 */                                   AbstractC1245n0.m4876d("ViewTransition", sb3.toString());
                                        } else {
/* 109 */                                   m3324b(context, xmlResourceParser);
                                        }
                                        break;
                                    case 366511058:
/* 93 */                                if (!name.equals("CustomMethod")) {
/* 168 */                                   AbstractC1245n0.m4876d("ViewTransition", de3.m3037s() + " unknown tag " + name);
/* 173 */                                   StringBuilder sb4 = new StringBuilder();
/* 178 */                                   sb4.append(".xml:");
/* 185 */                                   sb4.append(xmlResourceParser.getLineNumber());
/* 192 */                                   AbstractC1245n0.m4876d("ViewTransition", sb4.toString());
                                        } else {
/* 99 */                                    C2088pz.m7616d(context, xmlResourceParser, this.f7532g.f1182g);
                                        }
                                        break;
                                    case 1791837707:
/* 84 */                                if (!name.equals("CustomAttribute")) {
/* 168 */                                   AbstractC1245n0.m4876d("ViewTransition", de3.m3037s() + " unknown tag " + name);
/* 173 */                                   StringBuilder sb5 = new StringBuilder();
/* 178 */                                   sb5.append(".xml:");
/* 185 */                                   sb5.append(xmlResourceParser.getLineNumber());
/* 192 */                                   AbstractC1245n0.m4876d("ViewTransition", sb5.toString());
                                        } else {
/* 99 */                                    C2088pz.m7616d(context, xmlResourceParser, this.f7532g.f1182g);
                                        }
                                        break;
                                    default:
/* 168 */                               AbstractC1245n0.m4876d("ViewTransition", de3.m3037s() + " unknown tag " + name);
/* 173 */                               StringBuilder sb6 = new StringBuilder();
/* 178 */                               sb6.append(".xml:");
/* 185 */                               sb6.append(xmlResourceParser.getLineNumber());
/* 192 */                               AbstractC1245n0.m4876d("ViewTransition", sb6.toString());
                                        break;
                                }
                            } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
/* 210 */                       return;
                            }
/* 195 */                   eventType = xmlResourceParser.next();
                        }
                    } catch (IOException e) {
/* 202 */               e.printStackTrace();
                    } catch (XmlPullParserException e2) {
/* 207 */               e2.printStackTrace();
                    }
                }

                /* JADX INFO: renamed from: a */
                public final boolean m3323a(View view) {
                    String str;
/* 2 */             if (view == null) {
/* 1 */                 return false;
                    }
/* 8 */             if (this.f7535j == -1 && this.f7536k == null) {
/* 1 */                 return false;
                    }
/* 15 */            int i = this.f7543r;
/* 29 */            boolean z = i == -1 || view.getTag(i) != null;
/* 30 */            int i2 = this.f7544s;
/* 43 */            boolean z2 = i2 == -1 || view.getTag(i2) == null;
/* 44 */            if (z && z2) {
/* 54 */                if (view.getId() == this.f7535j) {
/* 17 */                    return true;
                        }
/* 59 */                if (this.f7536k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f1094Y) != null && str.matches(this.f7536k)) {
/* 17 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: b */
                public final void m3324b(Context context, XmlResourceParser xmlResourceParser) {
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.ViewTransition);
/* 11 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 16 */            for (int i = 0; i < indexCount; i++) {
/* 18 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 24 */                if (index == R$styleable.ViewTransition_android_id) {
/* 32 */                    this.f7526a = typedArrayObtainStyledAttributes.getResourceId(index, this.f7526a);
                        } else if (index == R$styleable.ViewTransition_motionTarget) {
/* 44 */                    if (MotionLayout.f875s1) {
/* 48 */                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f7535j);
/* 52 */                        this.f7535j = resourceId;
/* 54 */                        if (resourceId == -1) {
/* 60 */                            this.f7536k = typedArrayObtainStyledAttributes.getString(index);
                                }
                            } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
/* 76 */                        this.f7536k = typedArrayObtainStyledAttributes.getString(index);
                            } else {
/* 86 */                        this.f7535j = typedArrayObtainStyledAttributes.getResourceId(index, this.f7535j);
                            }
                        } else if (index == R$styleable.ViewTransition_onStateTransition) {
/* 100 */                   this.f7527b = typedArrayObtainStyledAttributes.getInt(index, this.f7527b);
                        } else if (index == R$styleable.ViewTransition_transitionDisable) {
/* 114 */                   this.f7528c = typedArrayObtainStyledAttributes.getBoolean(index, this.f7528c);
                        } else if (index == R$styleable.ViewTransition_pathMotionArc) {
/* 128 */                   this.f7529d = typedArrayObtainStyledAttributes.getInt(index, this.f7529d);
                        } else if (index == R$styleable.ViewTransition_duration) {
/* 142 */                   this.f7533h = typedArrayObtainStyledAttributes.getInt(index, this.f7533h);
                        } else if (index == R$styleable.ViewTransition_upDuration) {
/* 156 */                   this.f7534i = typedArrayObtainStyledAttributes.getInt(index, this.f7534i);
                        } else if (index == R$styleable.ViewTransition_viewTransitionMode) {
/* 170 */                   this.f7530e = typedArrayObtainStyledAttributes.getInt(index, this.f7530e);
                        } else if (index == R$styleable.ViewTransition_motionInterpolator) {
/* 182 */                   int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
/* 186 */                   if (i2 == 1) {
/* 188 */                       int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 192 */                       this.f7539n = resourceId2;
/* 194 */                       if (resourceId2 != -1) {
/* 196 */                           this.f7537l = -2;
                                }
                            } else if (i2 == 3) {
/* 202 */                       String string = typedArrayObtainStyledAttributes.getString(index);
/* 206 */                       this.f7538m = string;
/* 208 */                       if (string == null || string.indexOf("/") <= 0) {
/* 227 */                           this.f7537l = -1;
                                } else {
/* 222 */                           this.f7539n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
/* 224 */                           this.f7537l = -2;
                                }
                            } else {
/* 236 */                       this.f7537l = typedArrayObtainStyledAttributes.getInteger(index, this.f7537l);
                            }
                        } else if (index == R$styleable.ViewTransition_setsTag) {
/* 249 */                   this.f7541p = typedArrayObtainStyledAttributes.getResourceId(index, this.f7541p);
                        } else if (index == R$styleable.ViewTransition_clearsTag) {
/* 262 */                   this.f7542q = typedArrayObtainStyledAttributes.getResourceId(index, this.f7542q);
                        } else if (index == R$styleable.ViewTransition_ifTagSet) {
/* 275 */                   this.f7543r = typedArrayObtainStyledAttributes.getResourceId(index, this.f7543r);
                        } else if (index == R$styleable.ViewTransition_ifTagNotSet) {
/* 288 */                   this.f7544s = typedArrayObtainStyledAttributes.getResourceId(index, this.f7544s);
                        } else if (index == R$styleable.ViewTransition_SharedValueId) {
/* 301 */                   this.f7546u = typedArrayObtainStyledAttributes.getResourceId(index, this.f7546u);
                        } else if (index == R$styleable.ViewTransition_SharedValue) {
/* 314 */                   this.f7545t = typedArrayObtainStyledAttributes.getInteger(index, this.f7545t);
                        }
                    }
/* 320 */           typedArrayObtainStyledAttributes.recycle();
                }

                public final String toString() {
/* 24 */            return "ViewTransition(" + de3.m3039u(this.f7540o, this.f7526a) + ")";
                }
            }

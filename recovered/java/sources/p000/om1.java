            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class om1 {

                /* JADX INFO: renamed from: a */
                public ViewParent f14820a;

                /* JADX INFO: renamed from: b */
                public ViewParent f14821b;

                /* JADX INFO: renamed from: c */
                public final ViewGroup f14822c;

                /* JADX INFO: renamed from: d */
                public boolean f14823d;

                /* JADX INFO: renamed from: e */
                public int[] f14824e;

                public om1(ViewGroup viewGroup) {
/* 4 */             this.f14822c = viewGroup;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m7208a(float f, float f2, boolean z) {
                    ViewParent viewParentM7212e;
/* 4 */             if (this.f14823d && (viewParentM7212e = m7212e(0)) != null) {
                        try {
/* 14 */                    return n43.m6876a(viewParentM7212e, this.f14822c, f, f2, z);
                        } catch (AbstractMethodError e) {
/* 41 */                    AbstractC1245n0.m4877e("ViewParentCompat", "ViewParent " + viewParentM7212e + " does not implement interface method onNestedFling", e);
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m7209b(float f, float f2) {
                    ViewParent viewParentM7212e;
/* 4 */             if (this.f14823d && (viewParentM7212e = m7212e(0)) != null) {
                        try {
/* 14 */                    return n43.m6877b(viewParentM7212e, this.f14822c, f, f2);
                        } catch (AbstractMethodError e) {
/* 41 */                    AbstractC1245n0.m4877e("ViewParentCompat", "ViewParent " + viewParentM7212e + " does not implement interface method onNestedPreFling", e);
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: c */
                public final boolean m7210c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
                    ViewParent viewParentM7212e;
                    int i4;
                    int i5;
                    int[] iArr3;
/* 5 */             if (!this.f14823d || (viewParentM7212e = m7212e(i3)) == null) {
/* 4 */                 return false;
                    }
/* 16 */            if (i == 0 && i2 == 0) {
/* 21 */                if (iArr2 == null) {
/* 4 */                     return false;
                        }
/* 23 */                iArr2[0] = 0;
/* 25 */                iArr2[1] = 0;
/* 4 */                 return false;
                    }
/* 28 */            ViewGroup viewGroup = this.f14822c;
/* 30 */            if (iArr2 != null) {
/* 32 */                viewGroup.getLocationInWindow(iArr2);
/* 35 */                i4 = iArr2[0];
/* 37 */                i5 = iArr2[1];
                    } else {
/* 42 */                i4 = 0;
/* 43 */                i5 = 0;
                    }
/* 44 */            if (iArr == null) {
/* 48 */                if (this.f14824e == null) {
/* 53 */                    this.f14824e = new int[2];
                        }
/* 55 */                iArr3 = this.f14824e;
                    } else {
/* 59 */                iArr3 = iArr;
                    }
/* 60 */            iArr3[0] = 0;
/* 62 */            iArr3[1] = 0;
/* 66 */            if (viewParentM7212e instanceof pm1) {
/* 74 */                ((pm1) viewParentM7212e).onNestedPreScroll(viewGroup, i, i2, iArr3, i3);
                    } else if (i3 == 0) {
                        try {
/* 81 */                    n43.m6878c(viewParentM7212e, viewGroup, i, i2, iArr3);
                        } catch (AbstractMethodError e) {
/* 107 */                   AbstractC1245n0.m4877e("ViewParentCompat", "ViewParent " + viewParentM7212e + " does not implement interface method onNestedPreScroll", e);
                        }
                    }
/* 110 */           if (iArr2 != null) {
/* 77 */                viewGroup = viewGroup;
/* 112 */               viewGroup.getLocationInWindow(iArr2);
/* 118 */               iArr2[0] = iArr2[0] - i4;
/* 123 */               iArr2[1] = iArr2[1] - i5;
                    }
/* 77 */            viewGroup = viewGroup;
                    return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m7211d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
                    ViewParent viewParentM7212e;
                    int i6;
                    int i7;
                    int[] iArr3;
/* 8 */             if (this.f14823d && (viewParentM7212e = m7212e(i5)) != null) {
/* 19 */                if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
/* 35 */                    ViewGroup viewGroup = this.f14822c;
/* 37 */                    if (iArr != null) {
/* 39 */                        viewGroup.getLocationInWindow(iArr);
/* 42 */                        i6 = iArr[0];
/* 44 */                        i7 = iArr[1];
                            } else {
/* 49 */                        i6 = 0;
/* 50 */                        i7 = 0;
                            }
/* 51 */                    if (iArr2 == null) {
/* 55 */                        if (this.f14824e == null) {
/* 60 */                            this.f14824e = new int[2];
                                }
/* 62 */                        int[] iArr4 = this.f14824e;
/* 64 */                        iArr4[0] = 0;
/* 66 */                        iArr4[1] = 0;
/* 68 */                        iArr3 = iArr4;
                            } else {
/* 70 */                        iArr3 = iArr2;
                            }
/* 74 */                    if (viewParentM7212e instanceof qm1) {
/* 85 */                        ((qm1) viewParentM7212e).onNestedScroll(viewGroup, i, i2, i3, i4, i5, iArr3);
                            } else {
/* 93 */                        iArr3[0] = iArr3[0] + i3;
/* 99 */                        iArr3[1] = iArr3[1] + i4;
/* 103 */                       if (viewParentM7212e instanceof pm1) {
/* 116 */                           ((pm1) viewParentM7212e).onNestedScroll(viewGroup, i, i2, i3, i4, i5);
                                } else if (i5 == 0) {
                                    try {
/* 129 */                               n43.m6879d(viewParentM7212e, viewGroup, i, i2, i3, i4);
                                    } catch (AbstractMethodError e) {
/* 156 */                               AbstractC1245n0.m4877e("ViewParentCompat", "ViewParent " + viewParentM7212e + " does not implement interface method onNestedScroll", e);
                                    }
                                }
                            }
/* 159 */                   if (iArr != null) {
/* 161 */                       viewGroup.getLocationInWindow(iArr);
/* 167 */                       iArr[0] = iArr[0] - i6;
/* 172 */                       iArr[1] = iArr[1] - i7;
                            }
/* 18 */                    return true;
                        }
/* 28 */                if (iArr != null) {
/* 30 */                    iArr[0] = 0;
/* 32 */                    iArr[1] = 0;
/* 7 */                     return false;
                        }
                    }
/* 7 */             return false;
                }

                /* JADX INFO: renamed from: e */
                public final ViewParent m7212e(int i) {
/* 1 */             if (i == 0) {
/* 11 */                return this.f14820a;
                    }
/* 4 */             if (i != 1) {
/* 6 */                 return null;
                    }
/* 8 */             return this.f14821b;
                }

                /* JADX INFO: renamed from: f */
                public final boolean m7213f(int i) {
                    return m7212e(i) != null;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m7214g(int i, int i2) {
                    boolean zM6881f;
/* 6 */             if (!m7213f(i2)) {
/* 13 */                if (this.f14823d) {
/* 15 */                    ViewGroup viewGroup = this.f14822c;
/* 21 */                    View view = viewGroup;
/* 22 */                    for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
/* 24 */                        boolean z = parent instanceof pm1;
/* 30 */                        if (z) {
/* 35 */                            zM6881f = ((pm1) parent).onStartNestedScroll(view, viewGroup, i, i2);
                                } else if (i2 == 0) {
                                    try {
/* 42 */                                zM6881f = n43.m6881f(parent, view, viewGroup, i);
                                    } catch (AbstractMethodError e) {
/* 65 */                                AbstractC1245n0.m4877e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
/* 68 */                                zM6881f = false;
                                    }
                                } else {
/* 68 */                            zM6881f = false;
                                }
/* 69 */                        if (zM6881f) {
/* 71 */                            if (i2 == 0) {
/* 79 */                                this.f14820a = parent;
                                    } else if (i2 == 1) {
/* 76 */                                this.f14821b = parent;
                                    }
/* 81 */                            if (z) {
/* 85 */                                ((pm1) parent).onNestedScrollAccepted(view, viewGroup, i, i2);
                                    } else if (i2 == 0) {
                                        try {
/* 91 */                                    n43.m6880e(parent, view, viewGroup, i);
                                        } catch (AbstractMethodError e2) {
/* 113 */                                   AbstractC1245n0.m4877e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                                        }
                                    }
                                } else {
/* 119 */                           if (parent instanceof View) {
/* 122 */                               view = (View) parent;
                                    }
                                }
                            }
                        }
/* 12 */                return false;
                    }
/* 5 */             return true;
                }

                /* JADX INFO: renamed from: h */
                public final void m7215h(int i) {
/* 1 */             ViewParent viewParentM7212e = m7212e(i);
/* 5 */             if (viewParentM7212e != null) {
/* 7 */                 boolean z = viewParentM7212e instanceof pm1;
/* 9 */                 ViewGroup viewGroup = this.f14822c;
/* 11 */                if (z) {
/* 15 */                    ((pm1) viewParentM7212e).onStopNestedScroll(viewGroup, i);
                        } else if (i == 0) {
                            try {
/* 21 */                        n43.m6882g(viewParentM7212e, viewGroup);
                            } catch (AbstractMethodError e) {
/* 47 */                        AbstractC1245n0.m4877e("ViewParentCompat", "ViewParent " + viewParentM7212e + " does not implement interface method onStopNestedScroll", e);
                            }
                        }
/* 51 */                if (i == 0) {
/* 60 */                    this.f14820a = null;
                        } else {
/* 54 */                    if (i != 1) {
/* 62 */                        return;
                            }
/* 57 */                    this.f14821b = null;
                        }
                    }
                }
            }

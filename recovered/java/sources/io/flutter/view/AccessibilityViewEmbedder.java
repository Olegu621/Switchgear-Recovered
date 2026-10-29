            package io.flutter.view;

            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.util.SparseArray;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            import android.view.accessibility.AccessibilityRecord;
            import io.flutter.Log;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class AccessibilityViewEmbedder {
                private static final String TAG = "AccessibilityBridge";
                private int nextFlutterId;
                private final View rootAccessibilityView;
                private final ReflectionAccessors reflectionAccessors = new ReflectionAccessors();
                private final SparseArray<ViewAndId> flutterIdToOrigin = new SparseArray<>();
                private final Map<ViewAndId, Integer> originToFlutterId = new HashMap();
                private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ReflectionAccessors {
                    private final Field childNodeIdsField;
                    private final Method getChildId;
                    private final Method getParentNodeId;
                    private final Method getRecordSourceNodeId;
                    private final Method getSourceNodeId;
                    private final Method longArrayGetIndex;

                    /* JADX WARN: Multi-variable type inference failed */
                    private ReflectionAccessors() throws NoSuchMethodException {
                        Method method;
                        Method method2;
                        Method method3;
                        Field field;
                        Method method4;
                        Method method5;
/* 10 */                Method method6 = null;
                        try {
/* 11 */                    method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
                        } catch (NoSuchMethodException unused) {
/* 18 */                    Log.m4591w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
/* 21 */                    method = null;
                        }
                        try {
/* 24 */                    method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
                        } catch (NoSuchMethodException unused2) {
/* 31 */                    Log.m4591w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
/* 34 */                    method2 = null;
                        }
/* 35 */                int i = Build.VERSION.SDK_INT;
/* 39 */                Class<?> cls = Integer.TYPE;
/* 43 */                if (i > 26) {
                            try {
/* 82 */                        Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
/* 86 */                        declaredField.setAccessible(true);
/* 101 */                       method4 = Class.forName("android.util.LongArray").getMethod("get", cls);
/* 106 */                       field = declaredField;
/* 107 */                       method3 = null;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
/* 111 */                       Log.m4591w(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
/* 114 */                       method3 = null;
/* 115 */                       field = null;
/* 70 */                        method4 = field;
                            }
/* 117 */                   this.getSourceNodeId = method;
/* 119 */                   this.getParentNodeId = method6;
/* 121 */                   this.getRecordSourceNodeId = method2;
/* 123 */                   this.getChildId = method3;
/* 125 */                   this.childNodeIdsField = field;
/* 127 */                   this.longArrayGetIndex = method4;
                        }
                        try {
/* 47 */                    method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
                        } catch (NoSuchMethodException unused4) {
/* 54 */                    Log.m4591w(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
/* 57 */                    method5 = null;
                        }
                        try {
/* 64 */                    method3 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
/* 68 */                    field = null;
                        } catch (NoSuchMethodException unused5) {
/* 74 */                    Log.m4591w(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
/* 77 */                    method3 = null;
/* 78 */                    field = null;
                        }
/* 69 */                method6 = method5;
/* 70 */                method4 = field;
/* 117 */               this.getSourceNodeId = method;
/* 119 */               this.getParentNodeId = method6;
/* 121 */               this.getRecordSourceNodeId = method2;
/* 123 */               this.getChildId = method3;
/* 125 */               this.childNodeIdsField = field;
/* 127 */               this.longArrayGetIndex = method4;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public Long getChildId(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
/* 1 */                 Method method = this.getChildId;
/* 4 */                 if (method == null && (this.childNodeIdsField == null || this.longArrayGetIndex == null)) {
/* 3 */                     return null;
                        }
/* 17 */                if (method != null) {
                            try {
/* 31 */                        return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i));
                            } catch (IllegalAccessException e) {
/* 46 */                        Log.m4592w(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e);
                            } catch (InvocationTargetException e2) {
/* 40 */                        Log.m4592w(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e2);
                            }
                        } else {
                            try {
/* 70 */                        Long l = (Long) this.longArrayGetIndex.invoke(this.childNodeIdsField.get(accessibilityNodeInfo), Integer.valueOf(i));
/* 72 */                        l.longValue();
/* 75 */                        return l;
                            } catch (ArrayIndexOutOfBoundsException e3) {
/* 76 */                        e = e3;
/* 84 */                        Log.m4592w(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
/* 3 */                         return null;
                            } catch (IllegalAccessException e4) {
/* 90 */                        Log.m4592w(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e4);
                            } catch (InvocationTargetException e5) {
/* 78 */                        e = e5;
/* 84 */                        Log.m4592w(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
/* 3 */                         return null;
                            }
                        }
/* 3 */                 return null;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public Long getParentNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 3 */                 Method method = this.getParentNodeId;
/* 5 */                 if (method != null) {
                            try {
/* 12 */                        Long l = (Long) method.invoke(accessibilityNodeInfo, null);
/* 14 */                        l.longValue();
/* 17 */                        return l;
                            } catch (IllegalAccessException e) {
/* 30 */                        Log.m4592w(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e);
                            } catch (InvocationTargetException e2) {
/* 24 */                        Log.m4592w(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e2);
                            }
                        }
/* 33 */                return yoinkParentIdFromParcel(accessibilityNodeInfo);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public Long getRecordSourceNodeId(AccessibilityRecord accessibilityRecord) {
/* 3 */                 Method method = this.getRecordSourceNodeId;
/* 6 */                 if (method == null) {
/* 5 */                     return null;
                        }
                        try {
/* 13 */                    return (Long) method.invoke(accessibilityRecord, null);
                        } catch (IllegalAccessException e) {
/* 28 */                    Log.m4592w(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e);
/* 5 */                     return null;
                        } catch (InvocationTargetException e2) {
/* 22 */                    Log.m4592w(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e2);
/* 5 */                     return null;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public Long getSourceNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 3 */                 Method method = this.getSourceNodeId;
/* 6 */                 if (method == null) {
/* 5 */                     return null;
                        }
                        try {
/* 13 */                    return (Long) method.invoke(accessibilityNodeInfo, null);
                        } catch (IllegalAccessException e) {
/* 28 */                    Log.m4592w(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e);
/* 5 */                     return null;
                        } catch (InvocationTargetException e2) {
/* 22 */                    Log.m4592w(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e2);
/* 5 */                     return null;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static int getVirtualNodeId(long j) {
/* 4 */                 return (int) (j >> 32);
                    }

                    private static boolean isBitSet(long j, int i) {
                        return (j & (1 << i)) != 0;
                    }

                    private static Long yoinkParentIdFromParcel(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 6 */                 if (Build.VERSION.SDK_INT < 26) {
/* 12 */                    Log.m4591w(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
/* 5 */                     return null;
                        }
/* 16 */                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
/* 20 */                Parcel parcelObtain = Parcel.obtain();
/* 25 */                parcelObtain.setDataPosition(0);
/* 28 */                accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
/* 31 */                parcelObtain.setDataPosition(0);
/* 34 */                long j = parcelObtain.readLong();
/* 42 */                if (isBitSet(j, 0)) {
/* 44 */                    parcelObtain.readInt();
                        }
/* 52 */                if (isBitSet(j, 1)) {
/* 54 */                    parcelObtain.readLong();
                        }
/* 62 */                if (isBitSet(j, 2)) {
/* 64 */                    parcelObtain.readInt();
                        }
/* 78 */                Long lValueOf = isBitSet(j, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
/* 82 */                parcelObtain.recycle();
/* 85 */                return lValueOf;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ViewAndId {

                    /* JADX INFO: renamed from: id */
                    final int f9778id;
                    final View view;

                    private ViewAndId(View view, int i) {
/* 4 */                 this.view = view;
/* 6 */                 this.f9778id = i;
                    }

                    public boolean equals(Object obj) {
/* 2 */                 if (this == obj) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(obj instanceof ViewAndId)) {
/* 7 */                     return false;
                        }
/* 11 */                ViewAndId viewAndId = (ViewAndId) obj;
                        return this.f9778id == viewAndId.f9778id && this.view.equals(viewAndId.view);
                    }

                    public int hashCode() {
/* 13 */                return ((this.view.hashCode() + 31) * 31) + this.f9778id;
                    }
                }

                public AccessibilityViewEmbedder(View view, int i) {
/* 19 */            this.rootAccessibilityView = view;
/* 21 */            this.nextFlutterId = i;
                }

                private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
                    int iIntValue;
/* 6 */             for (int i = 0; i < accessibilityNodeInfo.getChildCount(); i++) {
/* 1 */                 Long childId = this.reflectionAccessors.getChildId(accessibilityNodeInfo, i);
/* 14 */                if (childId != null) {
/* 1 */                     int virtualNodeId = ReflectionAccessors.getVirtualNodeId(childId.longValue());
/* 28 */                    ViewAndId viewAndId = new ViewAndId(view, virtualNodeId);
/* 37 */                    if (this.originToFlutterId.containsKey(viewAndId)) {
/* 47 */                        iIntValue = this.originToFlutterId.get(viewAndId).intValue();
                            } else {
/* 52 */                        int i2 = this.nextFlutterId;
/* 56 */                        this.nextFlutterId = i2 + 1;
/* 58 */                        cacheVirtualIdMappings(view, virtualNodeId, i2);
/* 61 */                        iIntValue = i2;
                            }
/* 64 */                    accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
                        }
                    }
                }

                private void cacheVirtualIdMappings(View view, int i, int i2) {
/* 4 */             ViewAndId viewAndId = new ViewAndId(view, i);
/* 13 */            this.originToFlutterId.put(viewAndId, Integer.valueOf(i2));
/* 18 */            this.flutterIdToOrigin.put(i2, viewAndId);
                }

                private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
/* 3 */             AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
/* 17 */            accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
/* 22 */            accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i);
/* 29 */            accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
/* 34 */            Rect rect = this.embeddedViewToDisplayBounds.get(view);
/* 40 */            copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
/* 43 */            setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
/* 46 */            addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
/* 49 */            setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
/* 52 */            return accessibilityNodeInfoObtain;
                }

                private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
/* 5 */             accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
/* 12 */            accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
/* 19 */            accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
/* 26 */            accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
/* 33 */            accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
/* 40 */            accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
/* 47 */            accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
/* 54 */            accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
/* 61 */            accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
/* 68 */            accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
/* 75 */            accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
/* 82 */            accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
/* 89 */            accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
/* 96 */            accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
/* 103 */           accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
/* 110 */           accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
/* 117 */           accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
/* 124 */           accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
/* 131 */           accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
/* 138 */           accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
/* 145 */           accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
/* 152 */           accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
/* 159 */           accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
/* 166 */           accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
/* 173 */           accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
/* 180 */           accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
/* 187 */           accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
/* 194 */           accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
/* 201 */           accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
/* 208 */           accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
/* 215 */           if (Build.VERSION.SDK_INT >= 26) {
/* 1 */                 accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
/* 1 */                 accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
/* 1 */                 accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
                    }
                }

                private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
/* 1 */             Long parentNodeId = this.reflectionAccessors.getParentNodeId(accessibilityNodeInfo);
/* 7 */             if (parentNodeId == null) {
/* 43 */                return;
                    }
/* 26 */            Integer num = this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(parentNodeId.longValue())));
/* 32 */            if (num != null) {
/* 40 */                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
                    }
                }

                private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
/* 3 */             Rect rect2 = new Rect();
/* 6 */             accessibilityNodeInfo.getBoundsInParent(rect2);
/* 9 */             accessibilityNodeInfo2.setBoundsInParent(rect2);
/* 14 */            Rect rect3 = new Rect();
/* 17 */            accessibilityNodeInfo.getBoundsInScreen(rect3);
/* 24 */            rect3.offset(rect.left, rect.top);
/* 27 */            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                }

                public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                    AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
/* 3 */             ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
/* 10 */            if (viewAndId == null || !this.embeddedViewToDisplayBounds.containsKey(viewAndId.view) || viewAndId.view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = viewAndId.view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.f9778id)) == null) {
/* 9 */                 return null;
                    }
/* 50 */            return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i, viewAndId.view);
                }

                public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
/* 1 */             Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
/* 8 */             if (recordSourceNodeId == null) {
/* 7 */                 return null;
                    }
/* 26 */            return this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue())));
                }

                public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
/* 1 */             Long sourceNodeId = this.reflectionAccessors.getSourceNodeId(accessibilityNodeInfoCreateAccessibilityNodeInfo);
/* 11 */            if (sourceNodeId == null) {
/* 13 */                return null;
                    }
/* 17 */            this.embeddedViewToDisplayBounds.put(view, rect);
/* 28 */            cacheVirtualIdMappings(view, ReflectionAccessors.getVirtualNodeId(sourceNodeId.longValue()), i);
/* 31 */            return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i, view);
                }

                public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
/* 9 */             ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
/* 16 */            if (viewAndId == null) {
/* 15 */                return false;
                    }
/* 23 */            Rect rect = this.embeddedViewToDisplayBounds.get(viewAndId.view);
/* 29 */            int pointerCount = motionEvent.getPointerCount();
/* 33 */            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
/* 35 */            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
/* 41 */            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
/* 45 */                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
/* 48 */                pointerPropertiesArr[i2] = pointerProperties;
/* 50 */                motionEvent.getPointerProperties(i2, pointerProperties);
/* 55 */                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
/* 58 */                motionEvent.getPointerCoords(i2, pointerCoords);
/* 63 */                MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
/* 66 */                pointerCoordsArr[i2] = pointerCoords2;
/* 74 */                pointerCoords2.x -= rect.left;
/* 82 */                pointerCoords2.y -= rect.top;
                    }
/* 141 */           return viewAndId.view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
                }

                public boolean performAction(int i, int i2, Bundle bundle) {
                    AccessibilityNodeProvider accessibilityNodeProvider;
/* 3 */             ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
/* 10 */            if (viewAndId == null || (accessibilityNodeProvider = viewAndId.view.getAccessibilityNodeProvider()) == null) {
/* 9 */                 return false;
                    }
/* 24 */            return accessibilityNodeProvider.performAction(viewAndId.f9778id, i2, bundle);
                }

                public View platformViewOfNode(int i) {
/* 3 */             ViewAndId viewAndId = this.flutterIdToOrigin.get(i);
/* 9 */             if (viewAndId == null) {
/* 11 */                return null;
                    }
/* 13 */            return viewAndId.view;
                }

                public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
/* 1 */             AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
/* 1 */             Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityEvent);
/* 12 */            if (recordSourceNodeId == null) {
/* 11 */                return false;
                    }
/* 1 */             int virtualNodeId = ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue());
/* 31 */            Integer num = this.originToFlutterId.get(new ViewAndId(view, virtualNodeId));
/* 37 */            if (num == null) {
/* 39 */                int i = this.nextFlutterId;
/* 43 */                this.nextFlutterId = i + 1;
/* 45 */                Integer numValueOf = Integer.valueOf(i);
/* 49 */                cacheVirtualIdMappings(view, virtualNodeId, i);
/* 52 */                num = numValueOf;
                    }
/* 59 */            accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
/* 66 */            accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
/* 73 */            accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
/* 81 */            for (int i2 = 0; i2 < accessibilityEventObtain.getRecordCount(); i2++) {
/* 83 */                AccessibilityRecord record = accessibilityEventObtain.getRecord(i2);
/* 1 */                 Long recordSourceNodeId2 = this.reflectionAccessors.getRecordSourceNodeId(record);
/* 93 */                if (recordSourceNodeId2 == null) {
/* 11 */                    return false;
                        }
/* 106 */               ViewAndId viewAndId = new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(recordSourceNodeId2.longValue()));
/* 115 */               if (!this.originToFlutterId.containsKey(viewAndId)) {
/* 11 */                    return false;
                        }
/* 132 */               record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(viewAndId).intValue());
                    }
/* 144 */           return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
                }
            }

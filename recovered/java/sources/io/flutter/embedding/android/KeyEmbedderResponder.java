            package io.flutter.embedding.android;

            import android.view.KeyEvent;
            import io.flutter.Log;
            import io.flutter.embedding.android.KeyEmbedderResponder;
            import io.flutter.plugin.common.BinaryMessenger;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.k31;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class KeyEmbedderResponder implements KeyboardManager.Responder {
                private static final String TAG = "KeyEmbedderResponder";
                private final BinaryMessenger messenger;
                private final HashMap<Long, Long> pressingRecords = new HashMap<>();
                private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap<>();
                private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

                /* JADX INFO: renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C10481 {
                    static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

                    static {
/* 6 */                 int[] iArr = new int[KeyData.Type.values().length];
/* 8 */                 $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
                        try {
/* 17 */                    iArr[KeyData.Type.kDown.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kUp.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kRepeat.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                public KeyEmbedderResponder(BinaryMessenger binaryMessenger) {
/* 25 */            this.messenger = binaryMessenger;
/* 33 */            for (KeyboardMap.TogglingGoal togglingGoal : KeyboardMap.getTogglingGoals()) {
/* 45 */                this.togglingGoals.put(Long.valueOf(togglingGoal.logicalKey), togglingGoal);
                    }
                }

                private static KeyData.Type getEventType(KeyEvent keyEvent) {
/* 10 */            boolean z = keyEvent.getRepeatCount() > 0;
/* 11 */            int action = keyEvent.getAction();
/* 15 */            if (action == 0) {
                        return z ? KeyData.Type.kRepeat : KeyData.Type.kDown;
                    }
/* 17 */            if (action == 1) {
/* 19 */                return KeyData.Type.kUp;
                    }
/* 24 */            C1951n4.m6856g("Unexpected event type");
/* 27 */            return null;
                }

                private Long getLogicalKey(KeyEvent keyEvent) {
/* 12 */            Long l = KeyboardMap.keyCodeToLogical.get(Long.valueOf(keyEvent.getKeyCode()));
                    return l != null ? l : Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
                }

                private Long getPhysicalKey(KeyEvent keyEvent) {
/* 1 */             long scanCode = keyEvent.getScanCode();
/* 15 */            if (scanCode == 0) {
/* 26 */                return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
                    }
/* 37 */            Long l = KeyboardMap.scanCodeToPhysical.get(Long.valueOf(scanCode));
                    return l != null ? l : Long.valueOf(keyOfPlane(keyEvent.getScanCode(), KeyboardMap.kAndroidPlane));
                }

                /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:48:0x00cb A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
                /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
                /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
                /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
                /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
                /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
                /* JADX WARN: Code duplicated, block: B:65:0x0104  */
                /* JADX WARN: Code duplicated, block: B:66:0x0109  */
                /* JADX WARN: Code duplicated, block: B:67:0x010e  */
                /* JADX WARN: Code duplicated, block: B:68:0x0113  */
                /* JADX WARN: Code duplicated, block: B:72:0x013e A[LOOP:2: B:70:0x0138->B:72:0x013e, LOOP_END] */
                /* JADX WARN: Instruction removed from duplicated block: B:40:0x00b1, please report this as an issue */
                private boolean handleEventImpl(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
                    boolean z;
                    Long l;
                    KeyData.Type type;
                    KeyData keyData;
                    int source;
                    Iterator<Runnable> it;
                    KeyboardMap.TogglingGoal togglingGoal;
/* 6 */             if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
/* 5 */                 return false;
                    }
/* 15 */            Long physicalKey = getPhysicalKey(keyEvent);
/* 19 */            Long logicalKey = getLogicalKey(keyEvent);
/* 25 */            ArrayList<Runnable> arrayList = new ArrayList<>();
/* 33 */            for (KeyboardMap.PressingGoal pressingGoal : KeyboardMap.pressingGoals) {
/* 60 */                synchronizePressingKey(pressingGoal, (keyEvent.getMetaState() & pressingGoal.mask) != 0, logicalKey.longValue(), physicalKey.longValue(), keyEvent, arrayList);
                    }
/* 80 */            for (KeyboardMap.TogglingGoal togglingGoal2 : this.togglingGoals.values()) {
/* 107 */               synchronizeTogglingKey(togglingGoal2, (keyEvent.getMetaState() & togglingGoal2.mask) != 0, logicalKey.longValue(), keyEvent);
                    }
/* 111 */           int action = keyEvent.getAction();
/* 115 */           if (action == 0) {
/* 122 */               z = true;
                    } else {
/* 117 */               if (action != 1) {
/* 5 */                     return false;
                        }
/* 120 */               z = false;
                    }
/* 125 */           Long l2 = this.pressingRecords.get(physicalKey);
/* 133 */           if (z) {
/* 135 */               if (l2 != null) {
/* 145 */                   if (keyEvent.getRepeatCount() > 0) {
/* 147 */                       type = KeyData.Type.kRepeat;
                            } else {
/* 156 */                       l = physicalKey;
/* 157 */                       synthesizeEvent(false, l2, l, keyEvent.getEventTime());
/* 160 */                       type = KeyData.Type.kDown;
                            }
/* 172 */                   char cCharValue = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
/* 188 */                   String str = cCharValue != 0 ? HttpUrl.FRAGMENT_ENCODE_SET + cCharValue : null;
/* 202 */                   if (type != KeyData.Type.kRepeat) {
/* 207 */                       updatePressingState(l, z ? logicalKey : null);
                            }
/* 212 */                   if (type == KeyData.Type.kDown && (togglingGoal = this.togglingGoals.get(logicalKey)) != null) {
/* 227 */                       togglingGoal.enabled = !togglingGoal.enabled;
                            }
/* 231 */                   keyData = new KeyData();
/* 234 */                   source = keyEvent.getSource();
/* 240 */                   if (source == 513) {
/* 278 */                       keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
                            } else if (source == 1025) {
/* 273 */                       keyData.deviceType = KeyData.DeviceType.kGamepad;
                            } else if (source == 16777232) {
/* 268 */                       keyData.deviceType = KeyData.DeviceType.kJoystick;
                            } else if (source != 33554433) {
/* 258 */                       keyData.deviceType = KeyData.DeviceType.kKeyboard;
                            } else {
/* 263 */                       keyData.deviceType = KeyData.DeviceType.kHdmi;
                            }
/* 284 */                   keyData.timestamp = keyEvent.getEventTime();
/* 286 */                   keyData.type = type;
/* 292 */                   keyData.logicalKey = logicalKey.longValue();
/* 298 */                   keyData.physicalKey = l.longValue();
/* 300 */                   keyData.character = str;
/* 302 */                   keyData.synthesized = false;
/* 306 */                   sendKeyEvent(keyData, onKeyEventHandledCallback);
/* 309 */                   it = arrayList.iterator();
/* 317 */                   while (it.hasNext()) {
/* 325 */                       it.next().run();
                            }
/* 32 */                    return true;
                        }
/* 137 */               type = KeyData.Type.kDown;
/* 139 */               l = physicalKey;
/* 172 */               char cCharValue2 = this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()).charValue();
/* 188 */               if (cCharValue2 != 0) {
                        }
/* 202 */               if (type != KeyData.Type.kRepeat) {
/* 207 */                   updatePressingState(l, z ? logicalKey : null);
                        }
/* 212 */               if (type == KeyData.Type.kDown) {
/* 227 */                   togglingGoal.enabled = !togglingGoal.enabled;
                        }
/* 231 */               keyData = new KeyData();
/* 234 */               source = keyEvent.getSource();
/* 240 */               if (source == 513) {
/* 278 */                   keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
                        } else if (source == 1025) {
/* 273 */                   keyData.deviceType = KeyData.DeviceType.kGamepad;
                        } else if (source == 16777232) {
/* 268 */                   keyData.deviceType = KeyData.DeviceType.kJoystick;
                        } else if (source != 33554433) {
/* 258 */                   keyData.deviceType = KeyData.DeviceType.kKeyboard;
                        } else {
/* 263 */                   keyData.deviceType = KeyData.DeviceType.kHdmi;
                        }
/* 284 */               keyData.timestamp = keyEvent.getEventTime();
/* 286 */               keyData.type = type;
/* 292 */               keyData.logicalKey = logicalKey.longValue();
/* 298 */               keyData.physicalKey = l.longValue();
/* 300 */               keyData.character = str;
/* 302 */               keyData.synthesized = false;
/* 306 */               sendKeyEvent(keyData, onKeyEventHandledCallback);
/* 309 */               it = arrayList.iterator();
/* 317 */               while (it.hasNext()) {
/* 325 */                   it.next().run();
                        }
/* 32 */                return true;
                    }
/* 193 */           l = physicalKey;
/* 194 */           if (l2 == null) {
/* 5 */                 return false;
                    }
/* 197 */           type = KeyData.Type.kUp;
/* 202 */           if (type != KeyData.Type.kRepeat) {
/* 207 */               updatePressingState(l, z ? logicalKey : null);
                    }
/* 212 */           if (type == KeyData.Type.kDown) {
/* 227 */               togglingGoal.enabled = !togglingGoal.enabled;
                    }
/* 231 */           keyData = new KeyData();
/* 234 */           source = keyEvent.getSource();
/* 240 */           if (source == 513) {
/* 278 */               keyData.deviceType = KeyData.DeviceType.kDirectionalPad;
                    } else if (source == 1025) {
/* 273 */               keyData.deviceType = KeyData.DeviceType.kGamepad;
                    } else if (source == 16777232) {
/* 268 */               keyData.deviceType = KeyData.DeviceType.kJoystick;
                    } else if (source != 33554433) {
/* 258 */               keyData.deviceType = KeyData.DeviceType.kKeyboard;
                    } else {
/* 263 */               keyData.deviceType = KeyData.DeviceType.kHdmi;
                    }
/* 284 */           keyData.timestamp = keyEvent.getEventTime();
/* 286 */           keyData.type = type;
/* 292 */           keyData.logicalKey = logicalKey.longValue();
/* 298 */           keyData.physicalKey = l.longValue();
/* 300 */           keyData.character = str;
/* 302 */           keyData.synthesized = false;
/* 306 */           sendKeyEvent(keyData, onKeyEventHandledCallback);
/* 309 */           it = arrayList.iterator();
/* 317 */           while (it.hasNext()) {
/* 325 */               it.next().run();
                    }
/* 32 */            return true;
                }

                private static long keyOfPlane(long j, long j2) {
/* 7 */             return (j & KeyboardMap.kValueMask) | j2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, ByteBuffer byteBuffer) {
/* 1 */             Boolean boolValueOf = Boolean.FALSE;
/* 3 */             if (byteBuffer != null) {
/* 5 */                 byteBuffer.rewind();
/* 12 */                if (byteBuffer.capacity() != 0) {
/* 23 */                    boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                        }
                    } else {
/* 32 */                Log.m4591w(TAG, "A null reply was received when sending a key event to the framework.");
                    }
/* 39 */            onKeyEventHandledCallback.onKeyEventHandled(boolValueOf.booleanValue());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$synchronizePressingKey$0(KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
/* 17 */            synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j), keyEvent.getEventTime());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$synchronizePressingKey$1(KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
/* 17 */            synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j), keyEvent.getEventTime());
                }

                private void sendKeyEvent(KeyData keyData, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
/* 19 */            this.messenger.send(KeyData.CHANNEL, keyData.toBytes(), onKeyEventHandledCallback == null ? null : new BinaryMessenger.BinaryReply() { // from class: j31
                        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
                        public final void reply(ByteBuffer byteBuffer) {
/* 1 */                     KeyEmbedderResponder.lambda$sendKeyEvent$2(onKeyEventHandledCallback, byteBuffer);
                        }
                    });
                }

                private void synthesizeEvent(boolean z, Long l, Long l2, long j) {
/* 3 */             KeyData keyData = new KeyData();
/* 6 */             keyData.timestamp = j;
/* 15 */            keyData.type = z ? KeyData.Type.kDown : KeyData.Type.kUp;
/* 21 */            keyData.logicalKey = l.longValue();
/* 27 */            keyData.physicalKey = l2.longValue();
/* 30 */            keyData.character = null;
/* 33 */            keyData.synthesized = true;
/* 37 */            keyData.deviceType = KeyData.DeviceType.kKeyboard;
/* 47 */            if (l2.longValue() != 0 && l.longValue() != 0) {
/* 57 */                if (!z) {
/* 60 */                    l = null;
                        }
/* 61 */                updatePressingState(l2, l);
                    }
/* 64 */            sendKeyEvent(keyData, null);
                }

                public Map<Long, Long> getPressedState() {
/* 3 */             return Collections.unmodifiableMap(this.pressingRecords);
                }

                @Override // io.flutter.embedding.android.KeyboardManager.Responder
                public void handleEvent(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
/* 11 */            if (handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
/* 25 */                return;
                    }
/* 18 */            synthesizeEvent(true, 0L, 0L, 0L);
/* 22 */            onKeyEventHandledCallback.onKeyEventHandled(true);
                }

                public void synchronizePressingKey(KeyboardMap.PressingGoal pressingGoal, boolean z, long j, long j2, KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
/* 5 */             KeyboardMap.KeyPair[] keyPairArr = pressingGoal.keys;
/* 8 */             boolean[] zArr = new boolean[keyPairArr.length];
/* 11 */            Boolean[] boolArr = new Boolean[keyPairArr.length];
/* 14 */            int i = 0;
/* 15 */            boolean z2 = false;
                    while (true) {
/* 16 */                KeyboardMap.KeyPair[] keyPairArr2 = pressingGoal.keys;
/* 19 */                boolean z3 = true;
/* 20 */                if (i >= keyPairArr2.length) {
                            break;
                        }
/* 22 */                KeyboardMap.KeyPair keyPair = keyPairArr2[i];
/* 34 */                boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(keyPair.physicalKey));
/* 38 */                zArr[i] = zContainsKey;
/* 44 */                if (keyPair.logicalKey == j) {
/* 56 */                    int i2 = C10481.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
/* 58 */                    if (i2 != 1) {
/* 61 */                        if (i2 == 2) {
/* 98 */                            boolArr[i] = Boolean.valueOf(zArr[i]);
                                } else if (i2 == 3) {
/* 67 */                            if (!z) {
/* 80 */                                arrayList.add(new k31(this, keyPair, j2, keyEvent, 1));
                                    }
/* 89 */                            boolArr[i] = Boolean.valueOf(zArr[i]);
                                }
/* 131 */                       i++;
                            } else {
/* 103 */                       boolArr[i] = Boolean.FALSE;
/* 105 */                       if (!z) {
/* 120 */                           arrayList.add(new k31(this, keyPair, j2, keyEvent, 0));
                                }
                            }
                        } else if (!z2 && !zContainsKey) {
/* 129 */                   z3 = false;
                        }
/* 130 */               z2 = z3;
/* 131 */               i++;
                    }
/* 134 */           if (z) {
/* 140 */               for (int i3 = 0; i3 < pressingGoal.keys.length; i3++) {
/* 144 */                   if (boolArr[i3] == null) {
/* 147 */                       if (z2) {
/* 155 */                           boolArr[i3] = Boolean.valueOf(zArr[i3]);
                                } else {
/* 160 */                           boolArr[i3] = Boolean.TRUE;
/* 162 */                           z2 = true;
                                }
                            }
                        }
/* 166 */               if (!z2) {
/* 170 */                   boolArr[0] = Boolean.TRUE;
                        }
                    } else {
/* 177 */               for (int i4 = 0; i4 < pressingGoal.keys.length; i4++) {
/* 181 */                   if (boolArr[i4] == null) {
/* 186 */                       boolArr[i4] = Boolean.FALSE;
                            }
                        }
                    }
/* 194 */           for (int i5 = 0; i5 < pressingGoal.keys.length; i5++) {
/* 204 */               if (zArr[i5] != boolArr[i5].booleanValue()) {
/* 208 */                   KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i5];
/* 234 */                   synthesizeEvent(boolArr[i5].booleanValue(), Long.valueOf(keyPair2.logicalKey), Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
                        }
                    }
                }

                public void synchronizeTogglingKey(KeyboardMap.TogglingGoal togglingGoal, boolean z, long j, KeyEvent keyEvent) {
/* 5 */             if (togglingGoal.logicalKey == j || togglingGoal.enabled == z) {
/* 82 */                return;
                    }
/* 20 */            boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(togglingGoal.physicalKey));
/* 24 */            boolean z2 = !zContainsKey;
/* 26 */            if (!zContainsKey) {
/* 32 */                togglingGoal.enabled = !togglingGoal.enabled;
                    }
/* 51 */            synthesizeEvent(z2, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
/* 55 */            if (zContainsKey) {
/* 61 */                togglingGoal.enabled = !togglingGoal.enabled;
                    }
/* 79 */            synthesizeEvent(zContainsKey, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
                }

                public void updatePressingState(Long l, Long l2) {
/* 1 */             HashMap<Long, Long> map = this.pressingRecords;
/* 3 */             if (l2 != null) {
/* 11 */                if (map.put(l, l2) == null) {
/* 28 */                    return;
                        }
/* 16 */                C1951n4.m6856g("The key was not empty");
                    } else {
/* 26 */                if (map.remove(l) != null) {
/* 28 */                    return;
                        }
/* 31 */                C1951n4.m6856g("The key was empty");
                    }
                }
            }

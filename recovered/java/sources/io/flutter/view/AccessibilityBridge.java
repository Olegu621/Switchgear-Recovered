            package io.flutter.view;

            import android.app.Activity;
            import android.content.ContentResolver;
            import android.database.ContentObserver;
            import android.graphics.Rect;
            import android.net.Uri;
            import android.opengl.Matrix;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.provider.Settings;
            import android.text.SpannableString;
            import android.text.TextUtils;
            import android.text.style.LocaleSpan;
            import android.text.style.TtsSpan;
            import android.text.style.URLSpan;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            import androidx.core.app.NotificationCompat;
            import io.flutter.Log;
            import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
            import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
            import io.flutter.util.Predicate;
            import io.flutter.util.ViewUtils;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okhttp3.internal.http2.Http2Connection;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public class AccessibilityBridge extends AccessibilityNodeProvider {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private static final int ACTION_SHOW_ON_SCREEN = 16908342;
                private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
                private static final float DEFAULT_TRANSITION_ANIMATION_SCALE = 1.0f;
                private static final float DISABLED_TRANSITION_ANIMATION_SCALE = 0.0f;
                private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
                private static final int ROOT_NODE_ID = 0;
                private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
                private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
                private static final String TAG = "AccessibilityBridge";
                private final AccessibilityChannel accessibilityChannel;
                private int accessibilityFeatureFlags;
                private SemanticsNode accessibilityFocusedSemanticsNode;
                private final AccessibilityManager accessibilityManager;
                private final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler;
                private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
                private final AccessibilityViewEmbedder accessibilityViewEmbedder;
                private boolean accessibleNavigation;
                private final ContentObserver animationScaleObserver;
                private final ContentResolver contentResolver;
                private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions;
                private Integer embeddedAccessibilityFocusedNodeId;
                private Integer embeddedInputFocusedNodeId;
                private final List<Integer> flutterNavigationStack;
                private final Map<Integer, SemanticsNode> flutterSemanticsTree;
                private SemanticsNode hoveredObject;
                private SemanticsNode inputFocusedSemanticsNode;
                private boolean isReleased;
                private SemanticsNode lastInputFocusedSemanticsNode;
                private Integer lastLeftFrameInset;
                private OnAccessibilityChangeListener onAccessibilityChangeListener;
                private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
                private int previousRouteId;
                private final View rootAccessibilityView;
                private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
                private static final int SCROLLABLE_ACTIONS = ((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value;
                private static final int FOCUSABLE_FLAGS = ((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value;
                private static int FIRST_RESOURCE_ID = 267386881;
                static int systemAction = (Action.DID_GAIN_ACCESSIBILITY_FOCUS.value & Action.DID_LOSE_ACCESSIBILITY_FOCUS.value) & Action.SHOW_ON_SCREEN.value;

                /* JADX INFO: renamed from: io.flutter.view.AccessibilityBridge$5 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C11495 {

                    /* JADX INFO: renamed from: $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType */
                    static final /* synthetic */ int[] f9775x66a987df;

                    static {
/* 6 */                 int[] iArr = new int[StringAttributeType.values().length];
/* 8 */                 f9775x66a987df = iArr;
                        try {
/* 17 */                    iArr[StringAttributeType.SPELLOUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f9775x66a987df[StringAttributeType.LOCALE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f9775x66a987df[StringAttributeType.URL.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum AccessibilityFeature {
                    ACCESSIBLE_NAVIGATION(1),
                    INVERT_COLORS(2),
                    DISABLE_ANIMATIONS(4),
                    BOLD_TEXT(8),
                    REDUCE_MOTION(16),
                    HIGH_CONTRAST(32),
                    ON_OFF_SWITCH_LABELS(64),
                    NO_ANNOUNCE(128);

                    final int value;

                    AccessibilityFeature(int i) {
/* 4 */                 this.value = i;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Action {
                    TAP(1),
                    LONG_PRESS(2),
                    SCROLL_LEFT(4),
                    SCROLL_RIGHT(8),
                    SCROLL_UP(16),
                    SCROLL_DOWN(32),
                    INCREASE(64),
                    DECREASE(128),
                    SHOW_ON_SCREEN(NotificationCompat.FLAG_LOCAL_ONLY),
                    MOVE_CURSOR_FORWARD_BY_CHARACTER(NotificationCompat.FLAG_GROUP_SUMMARY),
                    MOVE_CURSOR_BACKWARD_BY_CHARACTER(Segment.SHARE_MINIMUM),
                    SET_SELECTION(2048),
                    COPY(4096),
                    CUT(Segment.SIZE),
                    PASTE(Http2.INITIAL_MAX_FRAME_SIZE),
                    DID_GAIN_ACCESSIBILITY_FOCUS(32768),
                    DID_LOSE_ACCESSIBILITY_FOCUS(AccessibilityBridge.MIN_ENGINE_GENERATED_NODE_ID),
                    CUSTOM_ACTION(131072),
                    DISMISS(262144),
                    MOVE_CURSOR_FORWARD_BY_WORD(524288),
                    MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
                    SET_TEXT(2097152),
                    FOCUS(4194304),
                    SCROLL_TO_OFFSET(8388608);

                    public final int value;

                    Action(int i) {
/* 4 */                 this.value = i;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class CustomAccessibilityAction {
                    private String hint;
                    private String label;
                    private int resourceId = -1;

                    /* JADX INFO: renamed from: id */
                    private int f9776id = -1;
                    private int overrideId = -1;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Flag {
                    HAS_CHECKED_STATE(1),
                    IS_CHECKED(2),
                    IS_SELECTED(4),
                    IS_BUTTON(8),
                    IS_TEXT_FIELD(16),
                    IS_FOCUSED(32),
                    HAS_ENABLED_STATE(64),
                    IS_ENABLED(128),
                    IS_IN_MUTUALLY_EXCLUSIVE_GROUP(NotificationCompat.FLAG_LOCAL_ONLY),
                    IS_HEADER(NotificationCompat.FLAG_GROUP_SUMMARY),
                    IS_OBSCURED(Segment.SHARE_MINIMUM),
                    SCOPES_ROUTE(2048),
                    NAMES_ROUTE(4096),
                    IS_HIDDEN(Segment.SIZE),
                    IS_IMAGE(Http2.INITIAL_MAX_FRAME_SIZE),
                    IS_LIVE_REGION(32768),
                    HAS_TOGGLED_STATE(AccessibilityBridge.MIN_ENGINE_GENERATED_NODE_ID),
                    IS_TOGGLED(131072),
                    HAS_IMPLICIT_SCROLLING(262144),
                    IS_MULTILINE(524288),
                    IS_READ_ONLY(1048576),
                    IS_FOCUSABLE(2097152),
                    IS_LINK(4194304),
                    IS_SLIDER(8388608),
                    IS_KEYBOARD_KEY(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE),
                    IS_CHECK_STATE_MIXED(33554432),
                    HAS_EXPANDED_STATE(67108864),
                    IS_EXPANDED(134217728),
                    HAS_SELECTED_STATE(268435456),
                    HAS_REQUIRED_STATE(536870912),
                    IS_REQUIRED(1073741824);

                    final int value;

                    Flag(int i) {
/* 4 */                 this.value = i;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LocaleStringAttribute extends StringAttribute {
                    String locale;

                    private LocaleStringAttribute() {
/* 2 */                 super();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface OnAccessibilityChangeListener {
                    void onAccessibilityChanged(boolean z, boolean z2);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SemanticsNode {
                    final AccessibilityBridge accessibilityBridge;
                    private int actions;
                    private float bottom;
                    private int currentValueLength;
                    private List<CustomAccessibilityAction> customAccessibilityActions;
                    private String decreasedValue;
                    private List<StringAttribute> decreasedValueAttributes;
                    private long flags;
                    private Rect globalRect;
                    private float[] globalTransform;
                    private String hint;
                    private List<StringAttribute> hintAttributes;
                    private String identifier;
                    private String increasedValue;
                    private List<StringAttribute> increasedValueAttributes;
                    private float[] inverseTransform;
                    private String label;
                    private List<StringAttribute> labelAttributes;
                    private float left;
                    private String linkUrl;
                    private int maxValueLength;
                    private CustomAccessibilityAction onLongPressOverride;
                    private CustomAccessibilityAction onTapOverride;
                    private SemanticsNode parent;
                    private int platformViewId;
                    private int previousActions;
                    private long previousFlags;
                    private String previousLabel;
                    private float previousScrollExtentMax;
                    private float previousScrollExtentMin;
                    private float previousScrollPosition;
                    private int previousTextSelectionBase;
                    private int previousTextSelectionExtent;
                    private String previousValue;
                    private float right;
                    private int scrollChildren;
                    private float scrollExtentMax;
                    private float scrollExtentMin;
                    private int scrollIndex;
                    private float scrollPosition;
                    private TextDirection textDirection;
                    private int textSelectionBase;
                    private int textSelectionExtent;
                    private String tooltip;
                    private float top;
                    private float[] transform;
                    private String value;
                    private List<StringAttribute> valueAttributes;

                    /* JADX INFO: renamed from: id */
                    private int f9777id = -1;
                    private int previousNodeId = -1;
                    private boolean hadPreviousConfig = false;
                    private List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
                    private List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
                    private boolean inverseTransformDirty = true;
                    private boolean globalGeometryDirty = true;

                    public SemanticsNode(AccessibilityBridge accessibilityBridge) {
/* 31 */                this.accessibilityBridge = accessibilityBridge;
                    }

                    public static /* synthetic */ int access$2212(SemanticsNode semanticsNode, int i) {
/* 3 */                 int i2 = semanticsNode.textSelectionExtent + i;
/* 4 */                 semanticsNode.textSelectionExtent = i2;
/* 6 */                 return i2;
                    }

                    public static /* synthetic */ int access$2220(SemanticsNode semanticsNode, int i) {
/* 3 */                 int i2 = semanticsNode.textSelectionExtent - i;
/* 4 */                 semanticsNode.textSelectionExtent = i2;
/* 6 */                 return i2;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void collectRoutes(List<SemanticsNode> list) {
/* 7 */                 if (hasFlag(Flag.SCOPES_ROUTE)) {
/* 9 */                     list.add(this);
                        }
/* 14 */                Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
/* 22 */                while (it.hasNext()) {
/* 30 */                    it.next().collectRoutes(list);
                        }
                    }

                    private SpannableString createSpannableString(String str, List<StringAttribute> list) {
/* 1 */                 if (str == null) {
/* 3 */                     return null;
                        }
/* 7 */                 SpannableString spannableString = new SpannableString(str);
/* 10 */                if (list != null) {
/* 20 */                    for (StringAttribute stringAttribute : list) {
/* 36 */                        int i = C11495.f9775x66a987df[stringAttribute.type.ordinal()];
/* 40 */                        if (i == 1) {
/* 104 */                           spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), stringAttribute.start, stringAttribute.end, 0);
                                } else if (i == 2) {
/* 85 */                            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((LocaleStringAttribute) stringAttribute).locale)), stringAttribute.start, stringAttribute.end, 0);
                                } else if (i == 3) {
/* 63 */                            spannableString.setSpan(new URLSpan(((UrlStringAttribute) stringAttribute).url), stringAttribute.start, stringAttribute.end, 0);
                                }
                            }
                        }
/* 108 */               return spannableString;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public boolean didChangeLabel() {
                        String str;
/* 1 */                 String str2 = this.label;
/* 4 */                 if (str2 == null && this.previousLabel == null) {
/* 3 */                     return false;
                        }
                        return str2 == null || (str = this.previousLabel) == null || !str2.equals(str);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public boolean didScroll() {
                        return (Float.isNaN(this.scrollPosition) || Float.isNaN(this.previousScrollPosition) || this.previousScrollPosition == this.scrollPosition) ? false : true;
                    }

                    private void ensureInverseTransform() {
/* 3 */                 if (this.inverseTransformDirty) {
/* 7 */                     this.inverseTransformDirty = false;
/* 11 */                    if (this.inverseTransform == null) {
/* 17 */                        this.inverseTransform = new float[16];
                            }
/* 27 */                    if (Matrix.invertM(this.inverseTransform, 0, this.transform, 0)) {
/* 35 */                        return;
                            }
/* 32 */                    Arrays.fill(this.inverseTransform, AccessibilityBridge.DISABLED_TRANSITION_ANIMATION_SCALE);
                        }
                    }

                    private SemanticsNode getAncestor(Predicate<SemanticsNode> predicate) {
/* 3 */                 for (SemanticsNode semanticsNode = this.parent; semanticsNode != null; semanticsNode = semanticsNode.parent) {
/* 9 */                     if (predicate.test(semanticsNode)) {
/* 11 */                        return semanticsNode;
                            }
                        }
/* 15 */                return null;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public Rect getGlobalRect() {
/* 1 */                 return this.globalRect;
                    }

                    private CharSequence getHint() {
/* 5 */                 return createSpannableString(this.hint, this.hintAttributes);
                    }

                    private CharSequence getLabel() {
/* 1 */                 List<StringAttribute> arrayList = this.labelAttributes;
/* 3 */                 String str = this.linkUrl;
/* 5 */                 if (str != null && str.length() > 0) {
/* 23 */                    arrayList = arrayList == null ? new ArrayList<>() : new ArrayList<>(arrayList);
/* 30 */                    UrlStringAttribute urlStringAttribute = new UrlStringAttribute();
/* 34 */                    urlStringAttribute.start = 0;
/* 42 */                    urlStringAttribute.end = this.label.length();
/* 46 */                    urlStringAttribute.url = this.linkUrl;
/* 50 */                    urlStringAttribute.type = StringAttributeType.URL;
/* 52 */                    arrayList.add(urlStringAttribute);
                        }
/* 57 */                return createSpannableString(this.label, arrayList);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public String getRouteName() {
                        String str;
/* 7 */                 if (hasFlag(Flag.NAMES_ROUTE) && (str = this.label) != null && !str.isEmpty()) {
/* 19 */                    return this.label;
                        }
/* 24 */                Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
/* 32 */                while (it.hasNext()) {
/* 40 */                    String routeName = it.next().getRouteName();
/* 44 */                    if (routeName != null && !routeName.isEmpty()) {
/* 52 */                        return routeName;
                            }
                        }
/* 53 */                return null;
                    }

                    private List<StringAttribute> getStringAttributesFromBuffer(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
/* 1 */                 int i = byteBuffer.getInt();
/* 7 */                 if (i == -1) {
/* 6 */                     return null;
                        }
/* 12 */                ArrayList arrayList = new ArrayList(i);
/* 16 */                for (int i2 = 0; i2 < i; i2++) {
/* 18 */                    int i3 = byteBuffer.getInt();
/* 22 */                    int i4 = byteBuffer.getInt();
/* 34 */                    StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
/* 42 */                    int i5 = C11495.f9775x66a987df[stringAttributeType.ordinal()];
/* 45 */                    if (i5 == 1) {
/* 88 */                        byteBuffer.getInt();
/* 93 */                        SpellOutStringAttribute spellOutStringAttribute = new SpellOutStringAttribute();
/* 96 */                        spellOutStringAttribute.start = i3;
/* 98 */                        spellOutStringAttribute.end = i4;
/* 100 */                       spellOutStringAttribute.type = stringAttributeType;
/* 102 */                       arrayList.add(spellOutStringAttribute);
                            } else if (i5 == 2) {
/* 55 */                        ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
/* 59 */                        LocaleStringAttribute localeStringAttribute = new LocaleStringAttribute();
/* 62 */                        localeStringAttribute.start = i3;
/* 64 */                        localeStringAttribute.end = i4;
/* 66 */                        localeStringAttribute.type = stringAttributeType;
/* 82 */                        localeStringAttribute.locale = Charset.forName("UTF-8").decode(byteBuffer2).toString();
/* 84 */                        arrayList.add(localeStringAttribute);
                            }
                        }
/* 108 */               return arrayList;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public CharSequence getTextFieldHint() {
/* 10 */                CharSequence[] charSequenceArr = {getLabel(), getHint()};
/* 18 */                CharSequence charSequenceConcat = null;
/* 20 */                for (int i = 0; i < 2; i++) {
/* 22 */                    CharSequence charSequence = charSequenceArr[i];
/* 24 */                    if (charSequence != null && charSequence.length() > 0) {
/* 57 */                        charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                            }
                        }
/* 61 */                return charSequenceConcat;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public CharSequence getValue() {
/* 5 */                 return createSpannableString(this.value, this.valueAttributes);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public CharSequence getValueLabelHint() {
/* 14 */                CharSequence[] charSequenceArr = {getValue(), getLabel(), getHint()};
/* 25 */                CharSequence charSequenceConcat = null;
/* 27 */                for (int i = 0; i < 3; i++) {
/* 29 */                    CharSequence charSequence = charSequenceArr[i];
/* 31 */                    if (charSequence != null && charSequence.length() > 0) {
/* 63 */                        charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                            }
                        }
/* 67 */                return charSequenceConcat;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public boolean hadAction(Action action) {
                        return (this.previousActions & action.value) != 0;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public boolean hadFlag(Flag flag) {
                        return (((long) flag.value) & this.previousFlags) != 0;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public boolean hasAction(Action action) {
                        return (this.actions & action.value) != 0;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public boolean hasFlag(Flag flag) {
                        return (((long) flag.value) & this.flags) != 0;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public SemanticsNode hitTest(float[] fArr, boolean z) {
/* 2 */                 float f = fArr[3];
/* 4 */                 boolean z2 = false;
/* 7 */                 float f2 = fArr[0] / f;
/* 11 */                float f3 = fArr[1] / f;
/* 17 */                if (f2 < this.left || f2 >= this.right || f3 < this.top || f3 >= this.bottom) {
/* 16 */                    return null;
                        }
/* 39 */                float[] fArr2 = new float[4];
/* 51 */                for (SemanticsNode semanticsNode : this.childrenInHitTestOrder) {
/* 65 */                    if (!semanticsNode.hasFlag(Flag.IS_HIDDEN)) {
/* 68 */                        semanticsNode.ensureInverseTransform();
/* 76 */                        float[] fArr3 = fArr;
/* 77 */                        Matrix.multiplyMV(fArr2, 0, semanticsNode.inverseTransform, 0, fArr3, 0);
/* 80 */                        SemanticsNode semanticsNodeHitTest = semanticsNode.hitTest(fArr2, z);
/* 84 */                        if (semanticsNodeHitTest != null) {
/* 86 */                            return semanticsNodeHitTest;
                                }
/* 87 */                        fArr = fArr3;
                            }
                        }
/* 89 */                if (z && this.platformViewId != -1) {
/* 96 */                    z2 = true;
                        }
/* 101 */               if (isFocusable() || z2) {
/* 107 */                   return this;
                        }
/* 16 */                return null;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public boolean isFocusable() {
                        String str;
                        String str2;
                        String str3;
/* 8 */                 if (hasFlag(Flag.SCOPES_ROUTE)) {
/* 7 */                     return false;
                        }
                        return (!hasFlag(Flag.IS_FOCUSABLE) && (this.actions & (~AccessibilityBridge.SCROLLABLE_ACTIONS)) == 0 && (this.flags & ((long) AccessibilityBridge.FOCUSABLE_FLAGS)) == 0 && ((str = this.label) == null || str.isEmpty()) && (((str2 = this.value) == null || str2.isEmpty()) && ((str3 = this.hint) == null || str3.isEmpty()))) ? false : true;
                    }

                    private void log(String str, boolean z) {
                    }

                    private float max(float f, float f2, float f3, float f4) {
/* 9 */                 return Math.max(f, Math.max(f2, Math.max(f3, f4)));
                    }

                    private float min(float f, float f2, float f3, float f4) {
/* 9 */                 return Math.min(f, Math.min(f2, Math.min(f3, f4)));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static boolean nullableHasAncestor(SemanticsNode semanticsNode, Predicate<SemanticsNode> predicate) {
                        return (semanticsNode == null || semanticsNode.getAncestor(predicate) == null) ? false : true;
                    }

                    private void transformPoint(float[] fArr, float[] fArr2, float[] fArr3) {
/* 7 */                 Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
/* 11 */                float f = fArr[3];
/* 17 */                fArr[0] = fArr[0] / f;
/* 23 */                fArr[1] = fArr[1] / f;
/* 29 */                fArr[2] = fArr[2] / f;
/* 32 */                fArr[3] = 0.0f;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void updateRecursively(float[] fArr, Set<SemanticsNode> set, boolean z) {
/* 1 */                 set.add(this);
/* 7 */                 if (this.globalGeometryDirty) {
/* 9 */                     z = true;
                        }
/* 10 */                if (z) {
/* 16 */                    if (this.globalTransform == null) {
/* 20 */                        this.globalTransform = new float[16];
                            }
/* 24 */                    if (this.transform == null) {
/* 28 */                        this.transform = new float[16];
                            }
/* 38 */                    Matrix.multiplyMM(this.globalTransform, 0, fArr, 0, this.transform, 0);
/* 42 */                    float[] fArr2 = {this.left, this.top, AccessibilityBridge.DISABLED_TRANSITION_ANIMATION_SCALE, AccessibilityBridge.DEFAULT_TRANSITION_ANIMATION_SCALE};
/* 53 */                    float[] fArr3 = new float[4];
/* 55 */                    float[] fArr4 = new float[4];
/* 57 */                    float[] fArr5 = new float[4];
/* 59 */                    float[] fArr6 = new float[4];
/* 72 */                    transformPoint(fArr3, this.globalTransform, fArr2);
/* 77 */                    fArr2[0] = this.right;
/* 81 */                    fArr2[1] = this.top;
/* 85 */                    transformPoint(fArr4, this.globalTransform, fArr2);
/* 90 */                    fArr2[0] = this.right;
/* 94 */                    fArr2[1] = this.bottom;
/* 98 */                    transformPoint(fArr5, this.globalTransform, fArr2);
/* 103 */                   fArr2[0] = this.left;
/* 107 */                   fArr2[1] = this.bottom;
/* 111 */                   transformPoint(fArr6, this.globalTransform, fArr2);
/* 116 */                   if (this.globalRect == null) {
/* 123 */                       this.globalRect = new Rect();
                            }
/* 191 */                   this.globalRect.set(Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
/* 194 */                   this.globalGeometryDirty = false;
                        }
/* 202 */               int i = -1;
/* 207 */               for (SemanticsNode semanticsNode : this.childrenInTraversalOrder) {
/* 215 */                   semanticsNode.previousNodeId = i;
/* 217 */                   i = semanticsNode.f9777id;
/* 221 */                   semanticsNode.updateRecursively(this.globalTransform, set, z);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void updateWith(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
/* 2 */                 this.hadPreviousConfig = true;
/* 6 */                 this.previousValue = this.value;
/* 10 */                this.previousLabel = this.label;
/* 14 */                this.previousFlags = this.flags;
/* 18 */                this.previousActions = this.actions;
/* 22 */                this.previousTextSelectionBase = this.textSelectionBase;
/* 26 */                this.previousTextSelectionExtent = this.textSelectionExtent;
/* 30 */                this.previousScrollPosition = this.scrollPosition;
/* 34 */                this.previousScrollExtentMax = this.scrollExtentMax;
/* 38 */                this.previousScrollExtentMin = this.scrollExtentMin;
/* 44 */                this.flags = byteBuffer.getLong();
/* 50 */                this.actions = byteBuffer.getInt();
/* 56 */                this.maxValueLength = byteBuffer.getInt();
/* 62 */                this.currentValueLength = byteBuffer.getInt();
/* 68 */                this.textSelectionBase = byteBuffer.getInt();
/* 74 */                this.textSelectionExtent = byteBuffer.getInt();
/* 80 */                this.platformViewId = byteBuffer.getInt();
/* 86 */                this.scrollChildren = byteBuffer.getInt();
/* 92 */                this.scrollIndex = byteBuffer.getInt();
/* 98 */                this.scrollPosition = byteBuffer.getFloat();
/* 104 */               this.scrollExtentMax = byteBuffer.getFloat();
/* 110 */               this.scrollExtentMin = byteBuffer.getFloat();
/* 112 */               int i = byteBuffer.getInt();
/* 124 */               this.identifier = i == -1 ? null : strArr[i];
/* 126 */               int i2 = byteBuffer.getInt();
/* 136 */               this.label = i2 == -1 ? null : strArr[i2];
/* 142 */               this.labelAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
/* 144 */               int i3 = byteBuffer.getInt();
/* 154 */               this.value = i3 == -1 ? null : strArr[i3];
/* 160 */               this.valueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
/* 162 */               int i4 = byteBuffer.getInt();
/* 172 */               this.increasedValue = i4 == -1 ? null : strArr[i4];
/* 178 */               this.increasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
/* 180 */               int i5 = byteBuffer.getInt();
/* 190 */               this.decreasedValue = i5 == -1 ? null : strArr[i5];
/* 196 */               this.decreasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
/* 198 */               int i6 = byteBuffer.getInt();
/* 208 */               this.hint = i6 == -1 ? null : strArr[i6];
/* 214 */               this.hintAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
/* 216 */               int i7 = byteBuffer.getInt();
/* 226 */               this.tooltip = i7 == -1 ? null : strArr[i7];
/* 228 */               int i8 = byteBuffer.getInt();
/* 238 */               this.linkUrl = i8 == -1 ? null : strArr[i8];
/* 248 */               this.textDirection = TextDirection.fromInt(byteBuffer.getInt());
/* 254 */               this.left = byteBuffer.getFloat();
/* 260 */               this.top = byteBuffer.getFloat();
/* 266 */               this.right = byteBuffer.getFloat();
/* 272 */               this.bottom = byteBuffer.getFloat();
/* 278 */               if (this.transform == null) {
/* 282 */                   this.transform = new float[16];
                        }
/* 286 */               for (int i9 = 0; i9 < 16; i9++) {
/* 294 */                   this.transform[i9] = byteBuffer.getFloat();
                        }
/* 299 */               this.inverseTransformDirty = true;
/* 301 */               this.globalGeometryDirty = true;
/* 303 */               int i10 = byteBuffer.getInt();
/* 309 */               this.childrenInTraversalOrder.clear();
/* 314 */               this.childrenInHitTestOrder.clear();
/* 318 */               for (int i11 = 0; i11 < i10; i11++) {
/* 1 */                     SemanticsNode orCreateSemanticsNode = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
/* 330 */                   orCreateSemanticsNode.parent = this;
/* 334 */                   this.childrenInTraversalOrder.add(orCreateSemanticsNode);
                        }
/* 341 */               for (int i12 = 0; i12 < i10; i12++) {
/* 1 */                     SemanticsNode orCreateSemanticsNode2 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
/* 353 */                   orCreateSemanticsNode2.parent = this;
/* 357 */                   this.childrenInHitTestOrder.add(orCreateSemanticsNode2);
                        }
/* 363 */               int i13 = byteBuffer.getInt();
/* 367 */               if (i13 == 0) {
/* 369 */                   this.customAccessibilityActions = null;
/* 371 */                   return;
                        }
/* 372 */               List<CustomAccessibilityAction> list = this.customAccessibilityActions;
/* 374 */               if (list == null) {
/* 381 */                   this.customAccessibilityActions = new ArrayList(i13);
                        } else {
/* 384 */                   list.clear();
                        }
/* 387 */               for (int i14 = 0; i14 < i13; i14++) {
/* 1 */                     CustomAccessibilityAction orCreateAccessibilityAction = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
/* 407 */                   if (orCreateAccessibilityAction.overrideId == Action.TAP.value) {
/* 409 */                       this.onTapOverride = orCreateAccessibilityAction;
                            } else if (orCreateAccessibilityAction.overrideId == Action.LONG_PRESS.value) {
/* 422 */                       this.onLongPressOverride = orCreateAccessibilityAction;
                            } else {
/* 427 */                       this.customAccessibilityActions.add(orCreateAccessibilityAction);
                            }
/* 432 */                   this.customAccessibilityActions.add(orCreateAccessibilityAction);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SpellOutStringAttribute extends StringAttribute {
                    private SpellOutStringAttribute() {
/* 2 */                 super();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class StringAttribute {
                    int end;
                    int start;
                    StringAttributeType type;

                    private StringAttribute() {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum StringAttributeType {
                    SPELLOUT,
                    LOCALE,
                    URL
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum TextDirection {
                    UNKNOWN,
                    LTR,
                    RTL;

                    public static TextDirection fromInt(int i) {
/* 2 */                 if (i != 1) {
                            return i != 2 ? UNKNOWN : LTR;
                        }
/* 13 */                return RTL;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class UrlStringAttribute extends StringAttribute {
                    String url;

                    private UrlStringAttribute() {
/* 2 */                 super();
                    }
                }

                public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel, final AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
/* 9 */             this.flutterSemanticsTree = new HashMap();
/* 16 */            this.customAccessibilityActions = new HashMap();
/* 19 */            this.accessibilityFeatureFlags = 0;
/* 26 */            this.flutterNavigationStack = new ArrayList();
/* 28 */            this.previousRouteId = 0;
/* 34 */            this.lastLeftFrameInset = 0;
/* 36 */            this.accessibleNavigation = false;
/* 38 */            this.isReleased = false;
/* 45 */            this.accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler() { // from class: io.flutter.view.AccessibilityBridge.1
                        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
                        public void announce(String str) {
/* 5 */                     if (Build.VERSION.SDK_INT >= 36) {
/* 11 */                        Log.m4591w(AccessibilityBridge.TAG, "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                            }
/* 20 */                    AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
                        public void onFocus(int i) {
/* 5 */                     AccessibilityBridge.this.sendAccessibilityEvent(i, 8);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
                        public void onLongPress(int i) {
/* 4 */                     AccessibilityBridge.this.sendAccessibilityEvent(i, 2);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
                        public void onTap(int i) {
/* 4 */                     AccessibilityBridge.this.sendAccessibilityEvent(i, 1);
                        }

                        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
                        public void onTooltip(String str) {
/* 5 */                     if (Build.VERSION.SDK_INT >= 28) {
/* 7 */                         return;
                            }
/* 1 */                     AccessibilityEvent accessibilityEventObtainAccessibilityEvent = AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
/* 21 */                    accessibilityEventObtainAccessibilityEvent.getText().add(str);
/* 1 */                     AccessibilityBridge.this.sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
                        }

                        @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
                        public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
/* 3 */                     byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
/* 8 */                     AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
                        }

                        @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
                        public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
/* 3 */                     byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
/* 8 */                     for (ByteBuffer byteBuffer2 : byteBufferArr) {
/* 14 */                        byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
                            }
/* 22 */                    AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
                        }
                    };
/* 49 */            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.2
                        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                        public void onAccessibilityStateChanged(boolean z) {
/* 7 */                     if (AccessibilityBridge.this.isReleased) {
/* 87 */                        return;
                            }
/* 10 */                    AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
/* 12 */                    if (z) {
/* 24 */                        accessibilityBridge.accessibilityChannel.setAccessibilityMessageHandler(AccessibilityBridge.this.accessibilityMessageHandler);
/* 33 */                        AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
                            } else {
/* 1 */                         accessibilityBridge.setAccessibleNavigation(false);
/* 48 */                        AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(null);
/* 57 */                        AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
                            }
/* 66 */                    if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
/* 84 */                        AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                            }
                        }
                    };
/* 52 */            this.accessibilityStateChangeListener = accessibilityStateChangeListener;
/* 61 */            ContentObserver contentObserver = new ContentObserver(new Handler()) { // from class: io.flutter.view.AccessibilityBridge.3
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z, Uri uri) {
/* 7 */                     if (AccessibilityBridge.this.isReleased) {
/* 9 */                         return;
                            }
/* 20 */                    float f = Settings.Global.getFloat(AccessibilityBridge.this.contentResolver, "transition_animation_scale", AccessibilityBridge.DEFAULT_TRANSITION_ANIMATION_SCALE);
/* 27 */                    AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
/* 29 */                    if (f == AccessibilityBridge.DISABLED_TRANSITION_ANIMATION_SCALE) {
/* 35 */                        AccessibilityBridge.access$1176(accessibilityBridge, AccessibilityFeature.DISABLE_ANIMATIONS.value);
                            } else {
/* 44 */                        AccessibilityBridge.access$1172(accessibilityBridge, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                            }
/* 1 */                     AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
                        }

                        @Override // android.database.ContentObserver
/* 52 */                public void onChange(boolean z) {
/* 53 */                    onChange(z, null);
                        }
                    };
/* 64 */            this.animationScaleObserver = contentObserver;
/* 66 */            this.rootAccessibilityView = view;
/* 68 */            this.accessibilityChannel = accessibilityChannel;
/* 70 */            this.accessibilityManager = accessibilityManager;
/* 72 */            this.contentResolver = contentResolver;
/* 74 */            this.accessibilityViewEmbedder = accessibilityViewEmbedder;
/* 76 */            this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate;
/* 82 */            accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
/* 85 */            accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
/* 90 */            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.4
                        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                        public void onTouchExplorationStateChanged(boolean z) {
/* 7 */                     if (AccessibilityBridge.this.isReleased) {
/* 46 */                        return;
                            }
/* 10 */                    if (!z) {
/* 1 */                         AccessibilityBridge.this.setAccessibleNavigation(false);
/* 1 */                         AccessibilityBridge.this.onTouchExplorationExit();
                            }
/* 29 */                    if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
/* 43 */                        AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(accessibilityManager.isEnabled(), z);
                            }
                        }
                    };
/* 93 */            this.touchExplorationStateChangeListener = touchExplorationStateChangeListener;
/* 99 */            touchExplorationStateChangeListener.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
/* 102 */           accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
/* 112 */           this.accessibilityFeatureFlags |= AccessibilityFeature.NO_ANNOUNCE.value;
/* 114 */           contentObserver.onChange(false);
/* 123 */           contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, contentObserver);
/* 130 */           if (Build.VERSION.SDK_INT >= 31) {
/* 132 */               setBoldTextFlag();
                    }
/* 135 */           platformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
                }

                public static /* synthetic */ int access$1172(AccessibilityBridge accessibilityBridge, int i) {
/* 3 */             int i2 = i & accessibilityBridge.accessibilityFeatureFlags;
/* 4 */             accessibilityBridge.accessibilityFeatureFlags = i2;
/* 6 */             return i2;
                }

                public static /* synthetic */ int access$1176(AccessibilityBridge accessibilityBridge, int i) {
/* 3 */             int i2 = i | accessibilityBridge.accessibilityFeatureFlags;
/* 4 */             accessibilityBridge.accessibilityFeatureFlags = i2;
/* 6 */             return i2;
                }

                private AccessibilityEvent createTextChangedEvent(int i, String str, String str2) {
/* 3 */             AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(i, 16);
/* 7 */             accessibilityEventObtainAccessibilityEvent.setBeforeText(str);
/* 14 */            accessibilityEventObtainAccessibilityEvent.getText().add(str2);
/* 17 */            int i2 = 0;
/* 22 */            while (i2 < str.length() && i2 < str2.length() && str.charAt(i2) == str2.charAt(i2)) {
/* 41 */                i2++;
                    }
/* 48 */            if (i2 >= str.length() && i2 >= str2.length()) {
/* 56 */                return null;
                    }
/* 58 */            accessibilityEventObtainAccessibilityEvent.setFromIndex(i2);
/* 65 */            int length = str.length() - 1;
/* 71 */            int length2 = str2.length() - 1;
/* 73 */            while (length >= i2 && length2 >= i2 && str.charAt(length) == str2.charAt(length2)) {
/* 88 */                length--;
/* 90 */                length2--;
                    }
/* 96 */            accessibilityEventObtainAccessibilityEvent.setRemovedCount((length - i2) + 1);
/* 102 */           accessibilityEventObtainAccessibilityEvent.setAddedCount((length2 - i2) + 1);
/* 105 */           return accessibilityEventObtainAccessibilityEvent;
                }

                private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
/* 7 */             Activity activity = ViewUtils.getActivity(this.rootAccessibilityView.getContext());
/* 11 */            if (activity == null || activity.getWindow() == null) {
/* 39 */                return false;
                    }
/* 1 */             int i = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
                    return i == 2 || i == 0;
                }

                private Rect getBoundsInScreen(Rect rect) {
/* 3 */             Rect rect2 = new Rect(rect);
/* 7 */             int[] iArr = new int[2];
/* 11 */            this.rootAccessibilityView.getLocationOnScreen(iArr);
/* 20 */            rect2.offset(iArr[0], iArr[1]);
/* 23 */            return rect2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public CustomAccessibilityAction getOrCreateAccessibilityAction(int i) {
/* 7 */             CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i));
/* 13 */            if (customAccessibilityAction != null) {
/* 38 */                return customAccessibilityAction;
                    }
/* 17 */            CustomAccessibilityAction customAccessibilityAction2 = new CustomAccessibilityAction();
/* 1 */             customAccessibilityAction2.f9776id = i;
/* 1 */             customAccessibilityAction2.resourceId = FIRST_RESOURCE_ID + i;
/* 35 */            this.customAccessibilityActions.put(Integer.valueOf(i), customAccessibilityAction2);
/* 38 */            return customAccessibilityAction2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public SemanticsNode getOrCreateSemanticsNode(int i) {
/* 7 */             SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i));
/* 13 */            if (semanticsNode != null) {
/* 32 */                return semanticsNode;
                    }
/* 17 */            SemanticsNode semanticsNode2 = new SemanticsNode(this);
/* 1 */             semanticsNode2.f9777id = i;
/* 29 */            this.flutterSemanticsTree.put(Integer.valueOf(i), semanticsNode2);
/* 32 */            return semanticsNode2;
                }

                private SemanticsNode getRootSemanticsNode() {
/* 8 */             return this.flutterSemanticsTree.get(0);
                }

                private void handleTouchExploration(float f, float f2, boolean z) {
                    SemanticsNode semanticsNodeHitTest;
/* 7 */             if (this.flutterSemanticsTree.isEmpty() || (semanticsNodeHitTest = getRootSemanticsNode().hitTest(new float[]{f, f2, DISABLED_TRANSITION_ANIMATION_SCALE, DEFAULT_TRANSITION_ANIMATION_SCALE}, z)) == this.hoveredObject) {
/* 66 */                return;
                    }
/* 40 */            if (semanticsNodeHitTest != null) {
/* 48 */                sendAccessibilityEvent(semanticsNodeHitTest.f9777id, 128);
                    }
/* 51 */            SemanticsNode semanticsNode = this.hoveredObject;
/* 53 */            if (semanticsNode != null) {
/* 61 */                sendAccessibilityEvent(semanticsNode.f9777id, NotificationCompat.FLAG_LOCAL_ONLY);
                    }
/* 64 */            this.hoveredObject = semanticsNodeHitTest;
                }

                private boolean isImportant(SemanticsNode semanticsNode) {
/* 8 */             if (semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
/* 7 */                 return false;
                    }
                    return (semanticsNode.getValueLabelHint() == null && (semanticsNode.actions & (~systemAction)) == 0) ? false : true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$0(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                    return semanticsNode2 == semanticsNode;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$1(SemanticsNode semanticsNode) {
/* 1 */             return semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public AccessibilityEvent obtainAccessibilityEvent(int i, int i2) {
/* 1 */             AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(i2);
/* 15 */            accessibilityEventObtainAccessibilityEvent.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
/* 20 */            accessibilityEventObtainAccessibilityEvent.setSource(this.rootAccessibilityView, i);
/* 23 */            return accessibilityEventObtainAccessibilityEvent;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void onTouchExplorationExit() {
/* 1 */             SemanticsNode semanticsNode = this.hoveredObject;
/* 3 */             if (semanticsNode != null) {
/* 11 */                sendAccessibilityEvent(semanticsNode.f9777id, NotificationCompat.FLAG_LOCAL_ONLY);
/* 15 */                this.hoveredObject = null;
                    }
                }

                private void onWindowNameChange(SemanticsNode semanticsNode) {
/* 1 */             String routeName = semanticsNode.getRouteName();
/* 5 */             if (routeName == null) {
/* 7 */                 routeName = " ";
                    }
/* 13 */            if (Build.VERSION.SDK_INT >= 28) {
/* 15 */                setAccessibilityPaneTitle(routeName);
/* 18 */                return;
                    }
/* 25 */            AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f9777id, 32);
/* 33 */            accessibilityEventObtainAccessibilityEvent.getText().add(routeName);
/* 36 */            sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
                }

                private boolean performCursorMoveAction(SemanticsNode semanticsNode, int i, Bundle bundle, boolean z) {
/* 3 */             int i2 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
/* 9 */             boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
/* 1 */             int i3 = semanticsNode.textSelectionBase;
/* 1 */             int i4 = semanticsNode.textSelectionExtent;
/* 21 */            predictCursorMovement(semanticsNode, i2, z, z2);
/* 28 */            if (i3 != semanticsNode.textSelectionBase || i4 != semanticsNode.textSelectionExtent) {
/* 47 */                String str = semanticsNode.value != null ? semanticsNode.value : HttpUrl.FRAGMENT_ENCODE_SET;
/* 55 */                AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f9777id, Segment.SIZE);
/* 63 */                accessibilityEventObtainAccessibilityEvent.getText().add(str);
/* 70 */                accessibilityEventObtainAccessibilityEvent.setFromIndex(semanticsNode.textSelectionBase);
/* 77 */                accessibilityEventObtainAccessibilityEvent.setToIndex(semanticsNode.textSelectionExtent);
/* 84 */                accessibilityEventObtainAccessibilityEvent.setItemCount(str.length());
/* 87 */                sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
                    }
/* 91 */            if (i2 == 1) {
/* 149 */               if (z) {
/* 151 */                   Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
/* 157 */                   if (semanticsNode.hasAction(action)) {
/* 165 */                       this.accessibilityChannel.dispatchSemanticsAction(i, action, Boolean.valueOf(z2));
/* 90 */                        return true;
                            }
                        }
/* 169 */               if (z) {
/* 189 */                   return false;
                        }
/* 171 */               Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
/* 177 */               if (!semanticsNode.hasAction(action2)) {
/* 189 */                   return false;
                        }
/* 185 */               this.accessibilityChannel.dispatchSemanticsAction(i, action2, Boolean.valueOf(z2));
/* 90 */                return true;
                    }
/* 94 */            if (i2 != 2) {
                        return i2 == 4 || i2 == 8 || i2 == 16;
                    }
/* 109 */           if (z) {
/* 111 */               Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
/* 117 */               if (semanticsNode.hasAction(action3)) {
/* 125 */                   this.accessibilityChannel.dispatchSemanticsAction(i, action3, Boolean.valueOf(z2));
/* 90 */                    return true;
                        }
                    }
/* 129 */           if (z) {
/* 189 */               return false;
                    }
/* 131 */           Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
/* 137 */           if (!semanticsNode.hasAction(action4)) {
/* 189 */               return false;
                    }
/* 145 */           this.accessibilityChannel.dispatchSemanticsAction(i, action4, Boolean.valueOf(z2));
/* 90 */            return true;
                }

                private boolean performSetText(SemanticsNode semanticsNode, int i, Bundle bundle) {
/* 16 */            String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? HttpUrl.FRAGMENT_ENCODE_SET : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
/* 22 */            this.accessibilityChannel.dispatchSemanticsAction(i, Action.SET_TEXT, string);
/* 1 */             semanticsNode.value = string;
/* 1 */             semanticsNode.valueAttributes = null;
/* 32 */            return true;
                }

                private void predictCursorMovement(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
/* 5 */             if (semanticsNode.textSelectionExtent < 0 || semanticsNode.textSelectionBase < 0) {
/* 322 */               return;
                    }
/* 16 */            if (i != 1) {
/* 20 */                if (i != 2) {
/* 23 */                    if (i != 4) {
/* 27 */                        if (i == 8 || i == 16) {
/* 35 */                            if (z) {
/* 1 */                                 semanticsNode.textSelectionExtent = semanticsNode.value.length();
                                    } else {
/* 1 */                                 semanticsNode.textSelectionExtent = 0;
                                    }
                                }
                            } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
/* 89 */                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
/* 97 */                        if (matcher.find()) {
/* 103 */                           SemanticsNode.access$2212(semanticsNode, matcher.start(1));
                                } else {
/* 1 */                             semanticsNode.textSelectionExtent = semanticsNode.value.length();
                                }
                            } else if (!z && semanticsNode.textSelectionExtent > 0) {
/* 147 */                       Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
/* 155 */                       if (matcher2.find()) {
/* 1 */                             semanticsNode.textSelectionExtent = matcher2.start(1);
                                } else {
/* 1 */                             semanticsNode.textSelectionExtent = 0;
                                }
                            }
                        } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
/* 205 */                   Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
/* 209 */                   matcher3.find();
/* 216 */                   if (matcher3.find()) {
/* 222 */                       SemanticsNode.access$2212(semanticsNode, matcher3.start(1));
                            } else {
/* 1 */                         semanticsNode.textSelectionExtent = semanticsNode.value.length();
                            }
                        } else if (!z && semanticsNode.textSelectionExtent > 0) {
/* 264 */                   Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
/* 272 */                   if (matcher4.find()) {
/* 1 */                         semanticsNode.textSelectionExtent = matcher4.start(1);
                            }
                        }
                    } else if (z && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
/* 298 */               SemanticsNode.access$2212(semanticsNode, 1);
                    } else if (!z && semanticsNode.textSelectionExtent > 0) {
/* 310 */               SemanticsNode.access$2220(semanticsNode, 1);
                    }
/* 313 */           if (z2) {
/* 322 */               return;
                    }
/* 1 */             semanticsNode.textSelectionBase = semanticsNode.textSelectionExtent;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 7 */             if (this.accessibilityManager.isEnabled()) {
/* 18 */                this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void sendLatestAccessibilityFlagsToFlutter() {
/* 5 */             this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
                }

                private void sendWindowContentChangeEvent(int i) {
/* 3 */             AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(i, 2048);
/* 8 */             accessibilityEventObtainAccessibilityEvent.setContentChangeTypes(1);
/* 11 */            sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
                }

                private void setAccessibilityPaneTitle(String str) {
/* 1 */             this.rootAccessibilityView.setAccessibilityPaneTitle(str);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setAccessibleNavigation(boolean z) {
/* 3 */             if (this.accessibleNavigation == z) {
/* 5 */                 return;
                    }
/* 6 */             this.accessibleNavigation = z;
/* 8 */             int i = this.accessibilityFeatureFlags;
/* 10 */            if (z) {
/* 17 */                this.accessibilityFeatureFlags = AccessibilityFeature.ACCESSIBLE_NAVIGATION.value | i;
                    } else {
/* 26 */                this.accessibilityFeatureFlags = (~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value) & i;
                    }
/* 28 */            sendLatestAccessibilityFlagsToFlutter();
                }

                private void setBoldTextFlag() {
/* 1 */             View view = this.rootAccessibilityView;
/* 3 */             if (view == null || view.getResources() == null) {
/* 58 */                return;
                    }
/* 1 */             int i = this.rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
/* 29 */            if (i == Integer.MAX_VALUE || i < BOLD_TEXT_WEIGHT_ADJUSTMENT) {
/* 53 */                this.accessibilityFeatureFlags &= ~AccessibilityFeature.BOLD_TEXT.value;
                    } else {
/* 42 */                this.accessibilityFeatureFlags |= AccessibilityFeature.BOLD_TEXT.value;
                    }
/* 55 */            sendLatestAccessibilityFlagsToFlutter();
                }

                private boolean shouldSetCollectionInfo(final SemanticsNode semanticsNode) {
/* 5 */             if (semanticsNode.scrollChildren > 0) {
                        return SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new Predicate() { // from class: io.flutter.view.a
                            @Override // io.flutter.util.Predicate
                            public final boolean test(Object obj) {
/* 1 */                         return AccessibilityBridge.lambda$shouldSetCollectionInfo$0(semanticsNode, (AccessibilityBridge.SemanticsNode) obj);
                            }
                        }) || !SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new C1153b());
                    }
/* 35 */            return false;
                }

                private void willRemoveSemanticsNode(SemanticsNode semanticsNode) {
                    View platformViewById;
                    Integer num;
/* 1 */             semanticsNode.parent = null;
/* 12 */            if (semanticsNode.platformViewId != -1 && (num = this.embeddedAccessibilityFocusedNodeId) != null && this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) == this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) {
/* 46 */                sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), MIN_ENGINE_GENERATED_NODE_ID);
/* 49 */                this.embeddedAccessibilityFocusedNodeId = null;
                    }
/* 55 */            if (semanticsNode.platformViewId != -1 && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) != null) {
/* 70 */                platformViewById.setImportantForAccessibility(4);
                    }
/* 73 */            SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
/* 75 */            if (semanticsNode2 == semanticsNode) {
/* 81 */                sendAccessibilityEvent(semanticsNode2.f9777id, MIN_ENGINE_GENERATED_NODE_ID);
/* 84 */                this.accessibilityFocusedSemanticsNode = null;
                    }
/* 88 */            if (this.inputFocusedSemanticsNode == semanticsNode) {
/* 90 */                this.inputFocusedSemanticsNode = null;
                    }
/* 94 */            if (this.hoveredObject == semanticsNode) {
/* 96 */                this.hoveredObject = null;
                    }
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                    int i2;
/* 1 */             boolean z = true;
/* 2 */             setAccessibleNavigation(true);
/* 7 */             if (i >= MIN_ENGINE_GENERATED_NODE_ID) {
/* 11 */                return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(i);
                    }
/* 18 */            if (i == -1) {
/* 22 */                AccessibilityNodeInfo accessibilityNodeInfoObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(this.rootAccessibilityView);
/* 28 */                this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtainAccessibilityNodeInfo);
/* 41 */                if (this.flutterSemanticsTree.containsKey(0)) {
/* 45 */                    accessibilityNodeInfoObtainAccessibilityNodeInfo.addChild(this.rootAccessibilityView, 0);
                        }
/* 48 */                accessibilityNodeInfoObtainAccessibilityNodeInfo.setImportantForAccessibility(false);
/* 51 */                return accessibilityNodeInfoObtainAccessibilityNodeInfo;
                    }
/* 58 */            SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i));
/* 64 */            if (semanticsNode == null) {
/* 97 */                return null;
                    }
/* 71 */            if (semanticsNode.platformViewId != -1 && this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode.platformViewId)) {
/* 91 */                View platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId);
/* 95 */                if (platformViewById == null) {
/* 97 */                    return null;
                        }
/* 109 */               return this.accessibilityViewEmbedder.getRootNode(platformViewById, semanticsNode.f9777id, semanticsNode.getGlobalRect());
                    }
/* 116 */           AccessibilityNodeInfo accessibilityNodeInfoObtainAccessibilityNodeInfo2 = obtainAccessibilityNodeInfo(this.rootAccessibilityView, i);
/* 124 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setImportantForAccessibility(isImportant(semanticsNode));
/* 127 */           CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
/* 129 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setViewIdResourceName(HttpUrl.FRAGMENT_ENCODE_SET);
/* 136 */           if (semanticsNode.identifier != null) {
/* 142 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setViewIdResourceName(semanticsNode.identifier);
                    }
/* 155 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
/* 160 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.view.View");
/* 165 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setSource(this.rootAccessibilityView, i);
/* 172 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setFocusable(semanticsNode.isFocusable());
/* 175 */           SemanticsNode semanticsNode2 = this.inputFocusedSemanticsNode;
/* 177 */           if (semanticsNode2 != null) {
/* 188 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setFocused(semanticsNode2.f9777id == i);
                    }
/* 191 */           SemanticsNode semanticsNode3 = this.accessibilityFocusedSemanticsNode;
/* 193 */           if (semanticsNode3 != null) {
/* 204 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setAccessibilityFocused(semanticsNode3.f9777id == i);
                    }
/* 207 */           Flag flag = Flag.IS_TEXT_FIELD;
/* 213 */           if (semanticsNode.hasFlag(flag)) {
/* 221 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setPassword(semanticsNode.hasFlag(Flag.IS_OBSCURED));
/* 224 */               Flag flag2 = Flag.IS_READ_ONLY;
/* 230 */               if (!semanticsNode.hasFlag(flag2)) {
/* 234 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.EditText");
                        }
/* 242 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setEditable(!semanticsNode.hasFlag(flag2));
/* 249 */               if (semanticsNode.textSelectionBase != -1 && semanticsNode.textSelectionExtent != -1) {
/* 265 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setTextSelection(semanticsNode.textSelectionBase, semanticsNode.textSelectionExtent);
                        }
/* 268 */               SemanticsNode semanticsNode4 = this.accessibilityFocusedSemanticsNode;
/* 270 */               if (semanticsNode4 != null && semanticsNode4.f9777id == i) {
/* 278 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLiveRegion(1);
                        }
/* 289 */               if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
/* 291 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(NotificationCompat.FLAG_LOCAL_ONLY);
/* 294 */                   i2 = 1;
                        } else {
/* 296 */                   i2 = 0;
                        }
/* 305 */               if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
/* 307 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(NotificationCompat.FLAG_GROUP_SUMMARY);
/* 310 */                   i2 = 1;
                        }
/* 317 */               if (semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
/* 319 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(NotificationCompat.FLAG_LOCAL_ONLY);
/* 322 */                   i2 |= 2;
                        }
/* 330 */               if (semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
/* 332 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(NotificationCompat.FLAG_GROUP_SUMMARY);
/* 335 */                   i2 |= 2;
                        }
/* 337 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setMovementGranularities(i2);
/* 344 */               if (semanticsNode.maxValueLength >= 0) {
/* 358 */                   int length = semanticsNode.value == null ? 0 : semanticsNode.value.length();
/* 1 */                     int unused = semanticsNode.currentValueLength;
/* 1 */                     int unused2 = semanticsNode.maxValueLength;
/* 378 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setMaxTextLength((length - semanticsNode.currentValueLength) + semanticsNode.maxValueLength);
                        }
                    }
/* 387 */           if (semanticsNode.hasAction(Action.SET_SELECTION)) {
/* 391 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(131072);
                    }
/* 400 */           if (semanticsNode.hasAction(Action.COPY)) {
/* 404 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(Http2.INITIAL_MAX_FRAME_SIZE);
                    }
/* 413 */           if (semanticsNode.hasAction(Action.CUT)) {
/* 415 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(MIN_ENGINE_GENERATED_NODE_ID);
                    }
/* 424 */           if (semanticsNode.hasAction(Action.PASTE)) {
/* 429 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(32768);
                    }
/* 438 */           if (semanticsNode.hasAction(Action.SET_TEXT)) {
/* 442 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(2097152);
                    }
/* 451 */           if (semanticsNode.hasFlag(Flag.IS_BUTTON)) {
/* 455 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.Button");
                    }
/* 464 */           if (semanticsNode.hasFlag(Flag.IS_IMAGE)) {
/* 468 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.ImageView");
                    }
/* 477 */           if (semanticsNode.hasAction(Action.DISMISS)) {
/* 479 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setDismissable(true);
/* 484 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(1048576);
                    }
/* 1 */             SemanticsNode semanticsNode5 = semanticsNode.parent;
/* 491 */           View view = this.rootAccessibilityView;
/* 493 */           if (semanticsNode5 != null) {
/* 503 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setParent(view, semanticsNode.parent.f9777id);
                    } else {
/* 507 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setParent(view);
                    }
/* 514 */           if (semanticsNode.previousNodeId != -1) {
/* 522 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setTraversalAfter(this.rootAccessibilityView, semanticsNode.previousNodeId);
                    }
/* 1 */             Rect globalRect = semanticsNode.getGlobalRect();
/* 533 */           if (semanticsNode.parent != null) {
/* 1 */                 Rect globalRect2 = semanticsNode.parent.getGlobalRect();
/* 545 */               Rect rect = new Rect(globalRect);
/* 554 */               rect.offset(-globalRect2.left, -globalRect2.top);
/* 557 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setBoundsInParent(rect);
                    } else {
/* 561 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setBoundsInParent(globalRect);
                    }
/* 568 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setBoundsInScreen(getBoundsInScreen(globalRect));
/* 571 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setVisibleToUser(true);
/* 594 */           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setEnabled(!semanticsNode.hasFlag(Flag.HAS_ENABLED_STATE) || semanticsNode.hasFlag(Flag.IS_ENABLED));
/* 605 */           if (semanticsNode.hasAction(Action.TAP)) {
/* 611 */               if (semanticsNode.onTapOverride != null) {
/* 626 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, semanticsNode.onTapOverride.hint));
/* 629 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClickable(true);
                        } else {
/* 633 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(16);
/* 636 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClickable(true);
                        }
                    } else if (semanticsNode.hasFlag(Flag.IS_SLIDER)) {
/* 648 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(16);
/* 651 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClickable(true);
                    }
/* 660 */           if (semanticsNode.hasAction(Action.LONG_PRESS)) {
/* 668 */               if (semanticsNode.onLongPressOverride != null) {
/* 683 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, semanticsNode.onLongPressOverride.hint));
/* 686 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLongClickable(true);
                        } else {
/* 690 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(32);
/* 693 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLongClickable(true);
                        }
                    }
/* 696 */           Action action = Action.SCROLL_LEFT;
/* 706 */           if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP) || semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
/* 732 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setScrollable(true);
/* 741 */               if (semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING)) {
/* 747 */                   if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_RIGHT)) {
/* 786 */                       if (shouldSetCollectionInfo(semanticsNode)) {
/* 796 */                           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, semanticsNode.scrollChildren, false));
                                } else {
/* 802 */                           accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.HorizontalScrollView");
                                }
                            } else if (shouldSetCollectionInfo(semanticsNode)) {
/* 772 */                       accessibilityNodeInfoObtainAccessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(semanticsNode.scrollChildren, 0, false));
                            } else {
/* 778 */                       accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.ScrollView");
                            }
                        }
/* 809 */               if (semanticsNode.hasAction(action) || semanticsNode.hasAction(Action.SCROLL_UP)) {
/* 819 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(4096);
                        }
/* 828 */               if (semanticsNode.hasAction(Action.SCROLL_RIGHT) || semanticsNode.hasAction(Action.SCROLL_DOWN)) {
/* 838 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(Segment.SIZE);
                        }
                    }
/* 841 */           Action action2 = Action.INCREASE;
/* 847 */           if (semanticsNode.hasAction(action2) || semanticsNode.hasAction(Action.DECREASE)) {
/* 859 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.SeekBar");
/* 866 */               if (semanticsNode.hasAction(action2)) {
/* 868 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(4096);
                        }
/* 877 */               if (semanticsNode.hasAction(Action.DECREASE)) {
/* 879 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(Segment.SIZE);
                        }
                    }
/* 888 */           if (semanticsNode.hasFlag(Flag.IS_LIVE_REGION)) {
/* 890 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setLiveRegion(1);
                    }
/* 899 */           if (semanticsNode.hasFlag(flag)) {
/* 905 */               accessibilityNodeInfoObtainAccessibilityNodeInfo2.setText(semanticsNode.getValue());
/* 910 */               if (Build.VERSION.SDK_INT >= 28) {
/* 1 */                     accessibilityNodeInfoObtainAccessibilityNodeInfo2.setHintText(semanticsNode.getTextFieldHint());
                        }
                    } else if (!semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
/* 1 */                 CharSequence valueLabelHint = semanticsNode.getValueLabelHint();
/* 934 */               if (Build.VERSION.SDK_INT < 28 && semanticsNode.tooltip != null) {
/* 942 */                   if (valueLabelHint != null) {
/* 944 */                       charSequence = valueLabelHint;
                            }
/* 965 */                   valueLabelHint = ((Object) charSequence) + "\n" + semanticsNode.tooltip;
                        }
/* 969 */               if (valueLabelHint != null) {
/* 971 */                   accessibilityNodeInfoObtainAccessibilityNodeInfo2.setContentDescription(valueLabelHint);
                        }
                    }
/* 974 */           int i3 = Build.VERSION.SDK_INT;
/* 976 */           if (i3 >= 28 && semanticsNode.tooltip != null) {
/* 1 */                 accessibilityNodeInfoObtainAccessibilityNodeInfo2.setTooltipText(semanticsNode.tooltip);
/* 995 */               if (semanticsNode.getValueLabelHint() == null) {
/* 1001 */                  accessibilityNodeInfoObtainAccessibilityNodeInfo2.setContentDescription(semanticsNode.tooltip);
                        }
                    }
/* 1 */             boolean zHasFlag = semanticsNode.hasFlag(Flag.HAS_CHECKED_STATE);
/* 1 */             boolean zHasFlag2 = semanticsNode.hasFlag(Flag.HAS_TOGGLED_STATE);
/* 1016 */          if (!zHasFlag && !zHasFlag2) {
/* 1021 */              z = false;
                    }
/* 1022 */          accessibilityNodeInfoObtainAccessibilityNodeInfo2.setCheckable(z);
/* 1025 */          if (zHasFlag) {
/* 1033 */              accessibilityNodeInfoObtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_CHECKED));
/* 1042 */              if (semanticsNode.hasFlag(Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
/* 1046 */                  accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.RadioButton");
                        } else {
/* 1052 */                  accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.CheckBox");
                        }
                    } else if (zHasFlag2) {
/* 1064 */              accessibilityNodeInfoObtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(Flag.IS_TOGGLED));
/* 1069 */              accessibilityNodeInfoObtainAccessibilityNodeInfo2.setClassName("android.widget.Switch");
                    }
/* 1078 */          accessibilityNodeInfoObtainAccessibilityNodeInfo2.setSelected(semanticsNode.hasFlag(Flag.IS_SELECTED));
/* 1081 */          if (i3 >= 28) {
/* 1 */                 accessibilityNodeInfoObtainAccessibilityNodeInfo2.setHeading(semanticsNode.hasFlag(Flag.IS_HEADER));
                    }
/* 1092 */          SemanticsNode semanticsNode6 = this.accessibilityFocusedSemanticsNode;
/* 1094 */          if (semanticsNode6 == null || semanticsNode6.f9777id != i) {
/* 1110 */              accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(64);
                    } else {
/* 1104 */              accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(128);
                    }
/* 1117 */          if (semanticsNode.customAccessibilityActions != null) {
/* 1131 */              for (CustomAccessibilityAction customAccessibilityAction : semanticsNode.customAccessibilityActions) {
/* 1152 */                  accessibilityNodeInfoObtainAccessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(customAccessibilityAction.resourceId, customAccessibilityAction.label));
                        }
                    }
/* 1168 */          for (SemanticsNode semanticsNode7 : semanticsNode.childrenInTraversalOrder) {
/* 1182 */              if (!semanticsNode7.hasFlag(Flag.IS_HIDDEN)) {
/* 1189 */                  if (semanticsNode7.platformViewId != -1) {
/* 1197 */                      View platformViewById2 = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode7.platformViewId);
/* 1211 */                      if (!this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode7.platformViewId)) {
/* 1213 */                          platformViewById2.setImportantForAccessibility(0);
/* 1216 */                          accessibilityNodeInfoObtainAccessibilityNodeInfo2.addChild(platformViewById2);
                                }
                            }
/* 1226 */                  accessibilityNodeInfoObtainAccessibilityNodeInfo2.addChild(this.rootAccessibilityView, semanticsNode7.f9777id);
                        }
                    }
/* 1230 */          return accessibilityNodeInfoObtainAccessibilityNodeInfo2;
                }

                public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
                    Integer recordFlutterId;
/* 8 */             if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
/* 7 */                 return false;
                    }
/* 20 */            int eventType = accessibilityEvent.getEventType();
/* 27 */            if (eventType == 8) {
/* 56 */                this.embeddedInputFocusedNodeId = recordFlutterId;
/* 58 */                this.inputFocusedSemanticsNode = null;
/* 60 */                return true;
                    }
/* 31 */            if (eventType == 128) {
/* 53 */                this.hoveredObject = null;
/* 60 */                return true;
                    }
/* 36 */            if (eventType == 32768) {
/* 48 */                this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
/* 50 */                this.accessibilityFocusedSemanticsNode = null;
/* 60 */                return true;
                    }
/* 40 */            if (eventType != MIN_ENGINE_GENERATED_NODE_ID) {
/* 60 */                return true;
                    }
/* 43 */            this.embeddedInputFocusedNodeId = null;
/* 45 */            this.embeddedAccessibilityFocusedNodeId = null;
/* 60 */            return true;
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public AccessibilityNodeInfo findFocus(int i) {
/* 2 */             if (i == 1) {
/* 8 */                 SemanticsNode semanticsNode = this.inputFocusedSemanticsNode;
/* 10 */                if (semanticsNode != null) {
/* 16 */                    return createAccessibilityNodeInfo(semanticsNode.f9777id);
                        }
/* 21 */                Integer num = this.embeddedInputFocusedNodeId;
/* 23 */                if (num != null) {
/* 29 */                    return createAccessibilityNodeInfo(num.intValue());
                        }
                    } else if (i != 2) {
/* 60 */                return null;
                    }
/* 34 */            SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
/* 36 */            if (semanticsNode2 != null) {
/* 42 */                return createAccessibilityNodeInfo(semanticsNode2.f9777id);
                    }
/* 47 */            Integer num2 = this.embeddedAccessibilityFocusedNodeId;
/* 49 */            if (num2 != null) {
/* 55 */                return createAccessibilityNodeInfo(num2.intValue());
                    }
/* 60 */            return null;
                }

                public boolean getAccessibleNavigation() {
/* 1 */             return this.accessibleNavigation;
                }

                public int getHoveredObjectId() {
/* 1 */             return this.hoveredObject.f9777id;
                }

                public boolean isAccessibilityEnabled() {
/* 3 */             return this.accessibilityManager.isEnabled();
                }

                public boolean isTouchExplorationEnabled() {
/* 3 */             return this.accessibilityManager.isTouchExplorationEnabled();
                }

                public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view) {
/* 1 */             return AccessibilityNodeInfo.obtain(view);
                }

                public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z) {
/* 8 */             if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
/* 7 */                 return false;
                    }
/* 1 */             SemanticsNode semanticsNodeHitTest = getRootSemanticsNode().hitTest(new float[]{motionEvent.getX(), motionEvent.getY(), DISABLED_TRANSITION_ANIMATION_SCALE, DEFAULT_TRANSITION_ANIMATION_SCALE}, z);
/* 53 */            if (semanticsNodeHitTest != null && semanticsNodeHitTest.platformViewId != -1) {
/* 62 */                if (z) {
/* 7 */                     return false;
                        }
/* 71 */                return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(semanticsNodeHitTest.f9777id, motionEvent);
                    }
/* 82 */            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
/* 132 */               handleTouchExploration(motionEvent.getX(), motionEvent.getY(), z);
                    } else {
/* 98 */                if (motionEvent.getAction() != 10) {
/* 120 */                   Log.m4583d("flutter", "unexpected accessibility hover event: " + motionEvent);
/* 7 */                     return false;
                        }
/* 100 */               onTouchExplorationExit();
                    }
/* 37 */            return true;
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public boolean performAction(int i, int i2, Bundle bundle) {
/* 4 */             if (i >= MIN_ENGINE_GENERATED_NODE_ID) {
/* 8 */                 boolean zPerformAction = this.accessibilityViewEmbedder.performAction(i, i2, bundle);
/* 12 */                if (zPerformAction && i2 == 128) {
/* 18 */                    this.embeddedAccessibilityFocusedNodeId = null;
                        }
/* 20 */                return zPerformAction;
                    }
/* 27 */            SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i));
/* 34 */            if (semanticsNode == null) {
/* 33 */                return false;
                    }
                    switch (i2) {
                        case 16:
/* 492 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.TAP);
/* 38 */                    return true;
                        case 32:
/* 484 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.LONG_PRESS);
/* 38 */                    return true;
                        case 64:
/* 406 */                   if (this.accessibilityFocusedSemanticsNode == null) {
/* 410 */                       this.rootAccessibilityView.invalidate();
                            }
/* 413 */                   this.accessibilityFocusedSemanticsNode = semanticsNode;
/* 419 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
/* 424 */                   HashMap map = new HashMap();
/* 431 */                   map.put("type", "didGainFocus");
/* 444 */                   map.put("nodeId", Integer.valueOf(semanticsNode.f9777id));
/* 451 */                   this.accessibilityChannel.channel.send(map);
/* 457 */                   sendAccessibilityEvent(i, 32768);
/* 466 */                   if (semanticsNode.hasAction(Action.INCREASE) || semanticsNode.hasAction(Action.DECREASE)) {
/* 476 */                       sendAccessibilityEvent(i, 4);
                            }
/* 38 */                    return true;
                        case 128:
/* 369 */                   SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
/* 371 */                   if (semanticsNode2 != null && semanticsNode2.f9777id == i) {
/* 379 */                       this.accessibilityFocusedSemanticsNode = null;
                            }
/* 381 */                   Integer num = this.embeddedAccessibilityFocusedNodeId;
/* 383 */                   if (num != null && num.intValue() == i) {
/* 391 */                       this.embeddedAccessibilityFocusedNodeId = null;
                            }
/* 397 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
/* 400 */                   sendAccessibilityEvent(i, MIN_ENGINE_GENERATED_NODE_ID);
/* 38 */                    return true;
                        case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
/* 364 */                   return performCursorMoveAction(semanticsNode, i, bundle, true);
                        case NotificationCompat.FLAG_GROUP_SUMMARY /* 512 */:
/* 359 */                   return performCursorMoveAction(semanticsNode, i, bundle, false);
                        case 4096:
/* 299 */                   Action action = Action.SCROLL_UP;
/* 305 */                   if (semanticsNode.hasAction(action)) {
/* 309 */                       this.accessibilityChannel.dispatchSemanticsAction(i, action);
                            } else {
/* 313 */                       Action action2 = Action.SCROLL_LEFT;
/* 319 */                       if (semanticsNode.hasAction(action2)) {
/* 323 */                           this.accessibilityChannel.dispatchSemanticsAction(i, action2);
                                } else {
/* 327 */                           Action action3 = Action.INCREASE;
/* 333 */                           if (!semanticsNode.hasAction(action3)) {
/* 33 */                                return false;
                                    }
/* 1 */                             semanticsNode.value = semanticsNode.increasedValue;
/* 1 */                             semanticsNode.valueAttributes = semanticsNode.increasedValueAttributes;
/* 349 */                           sendAccessibilityEvent(i, 4);
/* 354 */                           this.accessibilityChannel.dispatchSemanticsAction(i, action3);
                                }
                            }
/* 38 */                    return true;
                        case Segment.SIZE /* 8192 */:
/* 239 */                   Action action4 = Action.SCROLL_DOWN;
/* 245 */                   if (semanticsNode.hasAction(action4)) {
/* 249 */                       this.accessibilityChannel.dispatchSemanticsAction(i, action4);
                            } else {
/* 253 */                       Action action5 = Action.SCROLL_RIGHT;
/* 259 */                       if (semanticsNode.hasAction(action5)) {
/* 263 */                           this.accessibilityChannel.dispatchSemanticsAction(i, action5);
                                } else {
/* 267 */                           Action action6 = Action.DECREASE;
/* 273 */                           if (!semanticsNode.hasAction(action6)) {
/* 33 */                                return false;
                                    }
/* 1 */                             semanticsNode.value = semanticsNode.decreasedValue;
/* 1 */                             semanticsNode.valueAttributes = semanticsNode.decreasedValueAttributes;
/* 289 */                           sendAccessibilityEvent(i, 4);
/* 294 */                           this.accessibilityChannel.dispatchSemanticsAction(i, action6);
                                }
                            }
/* 38 */                    return true;
                        case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
/* 235 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.COPY);
/* 38 */                    return true;
                        case 32768:
/* 227 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.PASTE);
/* 38 */                    return true;
                        case MIN_ENGINE_GENERATED_NODE_ID /* 65536 */:
/* 219 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.CUT);
/* 38 */                    return true;
                        case 131072:
/* 99 */                    HashMap map2 = new HashMap();
/* 106 */                   if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
/* 132 */                       map2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
/* 143 */                       map2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                            } else {
/* 155 */                       map2.put("base", Integer.valueOf(semanticsNode.textSelectionExtent));
/* 166 */                       map2.put("extent", Integer.valueOf(semanticsNode.textSelectionExtent));
                            }
/* 173 */                   this.accessibilityChannel.dispatchSemanticsAction(i, Action.SET_SELECTION, map2);
/* 182 */                   SemanticsNode semanticsNode3 = this.flutterSemanticsTree.get(Integer.valueOf(i));
/* 1 */                     semanticsNode3.textSelectionBase = ((Integer) map2.get("base")).intValue();
/* 1 */                     semanticsNode3.textSelectionExtent = ((Integer) map2.get("extent")).intValue();
/* 38 */                    return true;
                        case 1048576:
/* 93 */                    this.accessibilityChannel.dispatchSemanticsAction(i, Action.DISMISS);
/* 38 */                    return true;
                        case 2097152:
/* 84 */                    return performSetText(semanticsNode, i, bundle);
                        case 16908342:
/* 80 */                    this.accessibilityChannel.dispatchSemanticsAction(i, Action.SHOW_ON_SCREEN);
/* 38 */                    return true;
                        default:
/* 51 */                    CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i2 - FIRST_RESOURCE_ID));
/* 57 */                    if (customAccessibilityAction == null) {
/* 33 */                        return false;
                            }
/* 71 */                    this.accessibilityChannel.dispatchSemanticsAction(i, Action.CUSTOM_ACTION, Integer.valueOf(customAccessibilityAction.f9776id));
/* 38 */                    return true;
                    }
                }

                public void release() {
/* 2 */             this.isReleased = true;
/* 6 */             this.platformViewsAccessibilityDelegate.detachAccessibilityBridge();
/* 10 */            setOnAccessibilityChangeListener(null);
/* 17 */            this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
/* 24 */            this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
/* 31 */            this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
/* 36 */            this.accessibilityChannel.setAccessibilityMessageHandler(null);
                }

                public void reset() {
/* 3 */             this.flutterSemanticsTree.clear();
/* 6 */             SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
/* 8 */             if (semanticsNode != null) {
/* 16 */                sendAccessibilityEvent(semanticsNode.f9777id, MIN_ENGINE_GENERATED_NODE_ID);
                    }
/* 20 */            this.accessibilityFocusedSemanticsNode = null;
/* 22 */            this.hoveredObject = null;
/* 25 */            sendWindowContentChangeEvent(0);
                }

                public void setOnAccessibilityChangeListener(OnAccessibilityChangeListener onAccessibilityChangeListener) {
/* 1 */             this.onAccessibilityChangeListener = onAccessibilityChangeListener;
                }

                public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
/* 5 */             while (byteBuffer.hasRemaining()) {
/* 11 */                CustomAccessibilityAction orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
/* 1 */                 orCreateAccessibilityAction.overrideId = byteBuffer.getInt();
/* 22 */                int i = byteBuffer.getInt();
/* 26 */                String str = null;
/* 1 */                 orCreateAccessibilityAction.label = i == -1 ? null : strArr[i];
/* 37 */                int i2 = byteBuffer.getInt();
/* 41 */                if (i2 != -1) {
/* 44 */                    str = strArr[i2];
                        }
/* 1 */                 orCreateAccessibilityAction.hint = str;
                    }
                }

                public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
                    SemanticsNode semanticsNode;
                    SemanticsNode semanticsNode2;
                    float f;
                    float f2;
                    View platformViewById;
/* 3 */             ArrayList<SemanticsNode> arrayList = new ArrayList();
/* 11 */            while (byteBuffer.hasRemaining()) {
/* 17 */                SemanticsNode orCreateSemanticsNode = getOrCreateSemanticsNode(byteBuffer.getInt());
/* 1 */                 orCreateSemanticsNode.updateWith(byteBuffer, strArr, byteBufferArr);
/* 30 */                if (!orCreateSemanticsNode.hasFlag(Flag.IS_HIDDEN)) {
/* 39 */                    if (orCreateSemanticsNode.hasFlag(Flag.IS_FOCUSED)) {
/* 41 */                        this.inputFocusedSemanticsNode = orCreateSemanticsNode;
                            }
/* 47 */                    if (orCreateSemanticsNode.hadPreviousConfig) {
/* 49 */                        arrayList.add(orCreateSemanticsNode);
                            }
/* 57 */                    if (orCreateSemanticsNode.platformViewId != -1 && !this.platformViewsAccessibilityDelegate.usesVirtualDisplay(orCreateSemanticsNode.platformViewId) && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(orCreateSemanticsNode.platformViewId)) != null) {
/* 83 */                        platformViewById.setImportantForAccessibility(0);
                            }
                        }
                    }
/* 89 */            HashSet hashSet = new HashSet();
/* 92 */            SemanticsNode rootSemanticsNode = getRootSemanticsNode();
/* 98 */            ArrayList<SemanticsNode> arrayList2 = new ArrayList();
/* 101 */           if (rootSemanticsNode != null) {
/* 105 */               float[] fArr = new float[16];
/* 107 */               Matrix.setIdentityM(fArr, 0);
/* 1 */                 rootSemanticsNode.updateRecursively(fArr, hashSet, false);
/* 1 */                 rootSemanticsNode.collectRoutes(arrayList2);
                    }
/* 121 */           SemanticsNode semanticsNode3 = null;
/* 126 */           for (SemanticsNode semanticsNode4 : arrayList2) {
/* 148 */               if (!this.flutterNavigationStack.contains(Integer.valueOf(semanticsNode4.f9777id))) {
/* 150 */                   semanticsNode3 = semanticsNode4;
                        }
                    }
/* 152 */           if (semanticsNode3 == null && arrayList2.size() > 0) {
/* 171 */               semanticsNode3 = (SemanticsNode) arrayList2.get(arrayList2.size() - 1);
                    }
/* 173 */           if (semanticsNode3 != null && (semanticsNode3.f9777id != this.previousRouteId || arrayList2.size() != this.flutterNavigationStack.size())) {
/* 199 */               this.previousRouteId = semanticsNode3.f9777id;
/* 201 */               onWindowNameChange(semanticsNode3);
                    }
/* 206 */           this.flutterNavigationStack.clear();
/* 209 */           Iterator it = arrayList2.iterator();
/* 217 */           while (it.hasNext()) {
/* 235 */               this.flutterNavigationStack.add(Integer.valueOf(((SemanticsNode) it.next()).f9777id));
                    }
/* 245 */           Iterator<Map.Entry<Integer, SemanticsNode>> it2 = this.flutterSemanticsTree.entrySet().iterator();
/* 253 */           while (it2.hasNext()) {
/* 261 */               SemanticsNode value = it2.next().getValue();
/* 271 */               if (!hashSet.contains(value)) {
/* 273 */                   willRemoveSemanticsNode(value);
/* 276 */                   it2.remove();
                        }
                    }
/* 280 */           sendWindowContentChangeEvent(0);
/* 291 */           for (SemanticsNode semanticsNode5 : arrayList) {
/* 303 */               if (semanticsNode5.didScroll()) {
/* 311 */                   AccessibilityEvent accessibilityEventObtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode5.f9777id, 4096);
/* 1 */                     float f3 = semanticsNode5.scrollPosition;
/* 1 */                     float f4 = semanticsNode5.scrollExtentMax;
/* 334 */                   if (Float.isInfinite(semanticsNode5.scrollExtentMax)) {
/* 341 */                       if (f3 > SCROLL_POSITION_CAP_FOR_INFINITY) {
/* 343 */                           f3 = 70000.0f;
                                }
/* 344 */                       f4 = 100000.0f;
                            }
/* 353 */                   if (Float.isInfinite(semanticsNode5.scrollExtentMin)) {
/* 355 */                       f = f4 + SCROLL_EXTENT_FOR_INFINITY;
/* 361 */                       if (f3 < -70000.0f) {
/* 363 */                           f3 = -70000.0f;
                                }
/* 364 */                       f2 = f3 + SCROLL_EXTENT_FOR_INFINITY;
                            } else {
/* 370 */                       f = f4 - semanticsNode5.scrollExtentMin;
/* 375 */                       f2 = f3 - semanticsNode5.scrollExtentMin;
                            }
/* 382 */                   if (semanticsNode5.hadAction(Action.SCROLL_UP) || semanticsNode5.hadAction(Action.SCROLL_DOWN)) {
/* 419 */                       accessibilityEventObtainAccessibilityEvent.setScrollY((int) f2);
/* 423 */                       accessibilityEventObtainAccessibilityEvent.setMaxScrollY((int) f);
                            } else if (semanticsNode5.hadAction(Action.SCROLL_LEFT) || semanticsNode5.hadAction(Action.SCROLL_RIGHT)) {
/* 410 */                       accessibilityEventObtainAccessibilityEvent.setScrollX((int) f2);
/* 414 */                       accessibilityEventObtainAccessibilityEvent.setMaxScrollX((int) f);
                            }
/* 430 */                   if (semanticsNode5.scrollChildren > 0) {
/* 436 */                       accessibilityEventObtainAccessibilityEvent.setItemCount(semanticsNode5.scrollChildren);
/* 443 */                       accessibilityEventObtainAccessibilityEvent.setFromIndex(semanticsNode5.scrollIndex);
/* 450 */                       Iterator it3 = semanticsNode5.childrenInHitTestOrder.iterator();
/* 454 */                       int i = 0;
/* 459 */                       while (it3.hasNext()) {
/* 473 */                           if (!((SemanticsNode) it3.next()).hasFlag(Flag.IS_HIDDEN)) {
/* 475 */                               i++;
                                    }
                                }
/* 485 */                       accessibilityEventObtainAccessibilityEvent.setToIndex((semanticsNode5.scrollIndex + i) - 1);
                            }
/* 488 */                   sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent);
                        }
/* 497 */               if (semanticsNode5.hasFlag(Flag.IS_LIVE_REGION) && semanticsNode5.didChangeLabel()) {
/* 509 */                   sendWindowContentChangeEvent(semanticsNode5.f9777id);
                        }
/* 512 */               SemanticsNode semanticsNode6 = this.accessibilityFocusedSemanticsNode;
/* 514 */               if (semanticsNode6 != null && semanticsNode6.f9777id == semanticsNode5.f9777id) {
/* 526 */                   Flag flag = Flag.IS_SELECTED;
/* 532 */                   if (!semanticsNode5.hadFlag(flag) && semanticsNode5.hasFlag(flag)) {
/* 545 */                       AccessibilityEvent accessibilityEventObtainAccessibilityEvent2 = obtainAccessibilityEvent(semanticsNode5.f9777id, 4);
/* 557 */                       accessibilityEventObtainAccessibilityEvent2.getText().add(semanticsNode5.label);
/* 560 */                       sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent2);
                            }
                        }
/* 563 */               SemanticsNode semanticsNode7 = this.inputFocusedSemanticsNode;
/* 565 */               if (semanticsNode7 != null && semanticsNode7.f9777id == semanticsNode5.f9777id && ((semanticsNode2 = this.lastInputFocusedSemanticsNode) == null || semanticsNode2.f9777id != this.inputFocusedSemanticsNode.f9777id)) {
/* 595 */                   this.lastInputFocusedSemanticsNode = this.inputFocusedSemanticsNode;
/* 607 */                   sendAccessibilityEvent(obtainAccessibilityEvent(semanticsNode5.f9777id, 8));
                        } else if (this.inputFocusedSemanticsNode == null) {
/* 615 */                   this.lastInputFocusedSemanticsNode = null;
                        }
/* 617 */               SemanticsNode semanticsNode8 = this.inputFocusedSemanticsNode;
/* 619 */               if (semanticsNode8 != null && semanticsNode8.f9777id == semanticsNode5.f9777id) {
/* 631 */                   Flag flag2 = Flag.IS_TEXT_FIELD;
/* 637 */                   if (semanticsNode5.hadFlag(flag2) && semanticsNode5.hasFlag(flag2) && ((semanticsNode = this.accessibilityFocusedSemanticsNode) == null || semanticsNode.f9777id == this.inputFocusedSemanticsNode.f9777id)) {
/* 1 */                         String str = semanticsNode5.previousValue;
/* 665 */                       String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 674 */                       String str3 = str != null ? semanticsNode5.previousValue : HttpUrl.FRAGMENT_ENCODE_SET;
/* 679 */                       if (semanticsNode5.value != null) {
/* 1 */                             str2 = semanticsNode5.value;
                                }
/* 689 */                       AccessibilityEvent accessibilityEventCreateTextChangedEvent = createTextChangedEvent(semanticsNode5.f9777id, str3, str2);
/* 693 */                       if (accessibilityEventCreateTextChangedEvent != null) {
/* 695 */                           sendAccessibilityEvent(accessibilityEventCreateTextChangedEvent);
                                }
/* 706 */                       if (semanticsNode5.previousTextSelectionBase != semanticsNode5.textSelectionBase || semanticsNode5.previousTextSelectionExtent != semanticsNode5.textSelectionExtent) {
/* 724 */                           AccessibilityEvent accessibilityEventObtainAccessibilityEvent3 = obtainAccessibilityEvent(semanticsNode5.f9777id, Segment.SIZE);
/* 732 */                           accessibilityEventObtainAccessibilityEvent3.getText().add(str2);
/* 739 */                           accessibilityEventObtainAccessibilityEvent3.setFromIndex(semanticsNode5.textSelectionBase);
/* 746 */                           accessibilityEventObtainAccessibilityEvent3.setToIndex(semanticsNode5.textSelectionExtent);
/* 753 */                           accessibilityEventObtainAccessibilityEvent3.setItemCount(str2.length());
/* 756 */                           sendAccessibilityEvent(accessibilityEventObtainAccessibilityEvent3);
                                }
                            }
                        }
                    }
                }

/* 5 */         public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view, int i) {
/* 6 */             return AccessibilityNodeInfo.obtain(view, i);
                }

/* 21 */        public void sendAccessibilityEvent(int i, int i2) {
/* 22 */            if (this.accessibilityManager.isEnabled()) {
/* 23 */                sendAccessibilityEvent(obtainAccessibilityEvent(i, i2));
                    }
                }

/* 23 */        public AccessibilityEvent obtainAccessibilityEvent(int i) {
/* 24 */            return AccessibilityEvent.obtain(i);
                }

/* 135 */       public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
/* 136 */           return onAccessibilityHoverEvent(motionEvent, false);
                }

/* 138 */       public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel, AccessibilityManager accessibilityManager, ContentResolver contentResolver, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
/* 139 */           this(view, accessibilityChannel, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, MIN_ENGINE_GENERATED_NODE_ID), platformViewsAccessibilityDelegate);
                }
            }

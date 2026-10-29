.class public Lcom/supercell/titan/KeyboardDialog;
.super Landroid/app/Dialog;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static U:Lcom/supercell/titan/KeyboardDialog;

.field public static final V:Landroid/graphics/Rect;

.field public static i:Ljava/lang/String;

.field public static v:[Landroid/text/InputFilter;

.field public static w:I


# instance fields
.field public final a:Lcom/supercell/titan/GameApp;

.field public final b:Landroid/widget/Button;

.field public final c:Le41;

.field public final d:Lbp2;

.field public e:Landroid/graphics/Typeface;

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/supercell/titan/KeyboardDialog;->V:Landroid/graphics/Rect;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lcom/supercell/titan/GameApp;)V
    .locals 2

    .line 1
    sget v0, Lcom/supercell/titan/R$style;->KeyboardDialog:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/supercell/titan/KeyboardDialog;->a:Lcom/supercell/titan/GameApp;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 10
    .line 11
    .line 12
    new-instance v0, Lbp2;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lyo2;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lxo2;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lzo2;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lzo2;-><init>(Lbp2;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 42
    .line 43
    new-instance v0, Landroid/widget/Button;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/supercell/titan/KeyboardDialog;->b:Landroid/widget/Button;

    .line 49
    .line 50
    new-instance v0, Le41;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/supercell/titan/KeyboardDialog;->c:Le41;

    .line 56
    .line 57
    new-instance v0, Landroid/graphics/Point;

    .line 58
    .line 59
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 71
    .line 72
    .line 73
    iget p1, v0, Landroid/graphics/Point;->x:I

    .line 74
    .line 75
    iput p1, p0, Lcom/supercell/titan/KeyboardDialog;->f:I

    .line 76
    .line 77
    sput-object p0, Lcom/supercell/titan/KeyboardDialog;->U:Lcom/supercell/titan/KeyboardDialog;

    .line 78
    .line 79
    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 1
    int-to-float p0, p0

    .line 2
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 18
    .line 19
    mul-float/2addr p0, v0

    .line 20
    const/high16 v0, 0x3f000000    # 0.5f

    .line 21
    .line 22
    add-float/2addr p0, v0

    .line 23
    float-to-int p0, p0

    .line 24
    return p0
.end method

.method public static getKeyboardSize(I)F
    .locals 4

    .line 1
    sget-boolean v0, Lcom/supercell/titan/VirtualKeyboardHandler;->visible:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    sget-object v0, Lcom/supercell/titan/KeyboardDialog;->U:Lcom/supercell/titan/KeyboardDialog;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, v0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v2, Lcom/supercell/titan/KeyboardDialog;->V:Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lcom/supercell/titan/KeyboardDialog;->U:Lcom/supercell/titan/KeyboardDialog;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    .line 29
    .line 30
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    sub-int/2addr v3, v2

    .line 33
    sub-int/2addr p0, v3

    .line 34
    add-int/2addr p0, v0

    .line 35
    int-to-float p0, p0

    .line 36
    cmpg-float v0, p0, v1

    .line 37
    .line 38
    if-gez v0, :cond_1

    .line 39
    .line 40
    return v1

    .line 41
    :cond_1
    return p0

    .line 42
    :cond_2
    :goto_0
    return v1
.end method

.method public static setImeOptions(I)V
    .locals 1

    .line 1
    sput p0, Lcom/supercell/titan/KeyboardDialog;->w:I

    .line 2
    .line 3
    sget-object v0, Lcom/supercell/titan/KeyboardDialog;->U:Lcom/supercell/titan/KeyboardDialog;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/supercell/titan/KeyboardDialog;->e:Landroid/graphics/Typeface;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 14
    .line 15
    .line 16
    const v1, 0x10001

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/widget/TextView;->setSingleLine()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ld41;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p0, v2}, Ld41;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lcom/supercell/titan/KeyboardDialog;->c:Le41;

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v4, p0, Lcom/supercell/titan/KeyboardDialog;->b:Landroid/widget/Button;

    .line 41
    .line 42
    invoke-virtual {v4, v1}, Landroid/view/View;->setId(I)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lu1;

    .line 46
    .line 47
    const/4 v5, 0x4

    .line 48
    invoke-direct {v1, p0, v5}, Lu1;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 55
    .line 56
    const/4 v5, -0x1

    .line 57
    invoke-direct {v1, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v0}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v3, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lcom/supercell/titan/KeyboardDialog;->i:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    sput-object v1, Lcom/supercell/titan/KeyboardDialog;->i:Ljava/lang/String;

    .line 81
    .line 82
    :cond_0
    sget-object v0, Lcom/supercell/titan/KeyboardDialog;->v:[Landroid/text/InputFilter;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 87
    .line 88
    .line 89
    sput-object v1, Lcom/supercell/titan/KeyboardDialog;->v:[Landroid/text/InputFilter;

    .line 90
    .line 91
    :cond_1
    sget v0, Lcom/supercell/titan/KeyboardDialog;->w:I

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/supercell/titan/KeyboardDialog;->updateUIFlags()V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final onStop()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    sput-object p0, Lcom/supercell/titan/KeyboardDialog;->i:Ljava/lang/String;

    .line 6
    .line 7
    sput-object p0, Lcom/supercell/titan/KeyboardDialog;->U:Lcom/supercell/titan/KeyboardDialog;

    .line 8
    .line 9
    return-void
.end method

.method public updateUIFlags()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, -0x1

    .line 19
    invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 20
    .line 21
    .line 22
    const/high16 v0, -0x80000000

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 25
    .line 26
    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v1, 0x1e

    .line 30
    .line 31
    if-ge v0, v1, :cond_0

    .line 32
    .line 33
    const/high16 v0, 0x8000000

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 36
    .line 37
    .line 38
    const/high16 v0, 0x4000000

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    const/16 v0, 0x400

    .line 44
    .line 45
    invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.class public final Lcom/usercentrics/sdk/ui/components/UCControllerId;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\r\u001a\u0004\u0008\u0012\u0010\u000fR\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\r\u001a\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\r\u001a\u0004\u0008\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\r\u001a\u0004\u0008\u001f\u0010\u001c\u00a8\u0006#"
    }
    d2 = {
        "Lcom/usercentrics/sdk/ui/components/UCControllerId;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lcom/usercentrics/sdk/ui/components/UCTextView;",
        "g0",
        "Lp51;",
        "getUcControllerIdLabel",
        "()Lcom/usercentrics/sdk/ui/components/UCTextView;",
        "ucControllerIdLabel",
        "h0",
        "getUcControllerIdValue",
        "ucControllerIdValue",
        "Lcom/usercentrics/sdk/ui/components/UCImageView;",
        "i0",
        "getUcControllerIdCopy",
        "()Lcom/usercentrics/sdk/ui/components/UCImageView;",
        "ucControllerIdCopy",
        "Landroid/graphics/drawable/Drawable;",
        "j0",
        "getDefaultIconDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "defaultIconDrawable",
        "k0",
        "getCheckedIconDrawable",
        "checkedIconDrawable",
        "Companion",
        "bu2",
        "usercentrics-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lbu2;


# instance fields
.field public final g0:Lhk2;

.field public final h0:Lhk2;

.field public final i0:Lhk2;

.field public final j0:Lhk2;

.field public final k0:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbu2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->Companion:Lbu2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 80
    invoke-direct {p0, p1, p2, v0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance p2, Lcu2;

    .line 8
    .line 9
    const/4 p3, 0x3

    .line 10
    invoke-direct {p2, p0, p3}, Lcu2;-><init>(Lcom/usercentrics/sdk/ui/components/UCControllerId;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->g0:Lhk2;

    .line 18
    .line 19
    new-instance p2, Lcu2;

    .line 20
    .line 21
    const/4 p3, 0x4

    .line 22
    invoke-direct {p2, p0, p3}, Lcu2;-><init>(Lcom/usercentrics/sdk/ui/components/UCControllerId;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->h0:Lhk2;

    .line 30
    .line 31
    new-instance p2, Lcu2;

    .line 32
    .line 33
    const/4 p3, 0x2

    .line 34
    invoke-direct {p2, p0, p3}, Lcu2;-><init>(Lcom/usercentrics/sdk/ui/components/UCControllerId;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->i0:Lhk2;

    .line 42
    .line 43
    new-instance p2, Lcu2;

    .line 44
    .line 45
    const/4 p3, 0x1

    .line 46
    invoke-direct {p2, p0, p3}, Lcu2;-><init>(Lcom/usercentrics/sdk/ui/components/UCControllerId;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->j0:Lhk2;

    .line 54
    .line 55
    new-instance p2, Lcu2;

    .line 56
    .line 57
    const/4 p3, 0x0

    .line 58
    invoke-direct {p2, p0, p3}, Lcu2;-><init>(Lcom/usercentrics/sdk/ui/components/UCControllerId;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iput-object p2, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->k0:Lhk2;

    .line 66
    .line 67
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget p2, Lcom/usercentrics/sdk/ui/R$layout;->uc_controller_id:I

    .line 72
    .line 73
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->l()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private final getCheckedIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->k0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getDefaultIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->j0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getUcControllerIdCopy()Lcom/usercentrics/sdk/ui/components/UCImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->i0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcControllerIdLabel()Lcom/usercentrics/sdk/ui/components/UCTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->g0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getUcControllerIdValue()Lcom/usercentrics/sdk/ui/components/UCTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/UCControllerId;->h0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-object p0
.end method

.method public static j(Ldu2;Lcom/usercentrics/sdk/ui/components/UCControllerId;Lcom/usercentrics/sdk/ui/components/UCImageView;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldu2;->d:Lv11;

    .line 2
    .line 3
    invoke-virtual {p0}, Lv11;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-direct {p1}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getUcControllerIdCopy()Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p1}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getCheckedIconDrawable()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lf72;

    .line 22
    .line 23
    const/16 v0, 0x9

    .line 24
    .line 25
    invoke-direct {p0, p1, v0}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v0, 0xdac

    .line 29
    .line 30
    invoke-virtual {p2, p0, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final k(Ldu2;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getUcControllerIdLabel()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Ldu2;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getUcControllerIdValue()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p1, Ldu2;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x1

    .line 36
    if-ne v1, v2, :cond_0

    .line 37
    .line 38
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 42
    .line 43
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getUcControllerIdCopy()Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p1, Ldu2;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lau2;

    .line 56
    .line 57
    invoke-direct {v1, p1, p0, v0}, Lau2;-><init>(Ldu2;Lcom/usercentrics/sdk/ui/components/UCControllerId;Lcom/usercentrics/sdk/ui/components/UCImageView;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getUcControllerIdCopy()Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getDefaultIconDrawable()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lxe2;->c(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final m(Lew2;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lew2;->a:Lwt2;

    .line 5
    .line 6
    iget-object v1, v0, Lwt2;->b:Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, Lkb1;->F(Lwt2;Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getUcControllerIdLabel()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/16 v2, 0x16

    .line 27
    .line 28
    invoke-static {v0, p1, v2}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getUcControllerIdValue()Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/16 v2, 0xe

    .line 36
    .line 37
    invoke-static {v0, p1, v2}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getDefaultIconDrawable()Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 53
    .line 54
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 55
    .line 56
    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-direct {p0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->getCheckedIconDrawable()Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    .line 75
    .line 76
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 77
    .line 78
    invoke-direct {v0, p1, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void
.end method

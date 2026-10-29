.class public final Li51;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/widget/PopupWindow;

.field public c:Ln01;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lew2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Li51;->a:Landroid/content/Context;

    .line 11
    .line 12
    new-instance p1, Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/widget/PopupWindow;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Li51;->b:Landroid/widget/PopupWindow;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iget-object p0, p0, Li51;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {p0, v0}, Lyy1;->o(Landroid/content/Context;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final onDismiss()V
    .locals 1

    .line 1
    iget-object p0, p0, Li51;->b:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

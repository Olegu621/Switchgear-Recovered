.class public final Lwx;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ld71;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/ComponentActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwx;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwx;->b:Landroidx/activity/ComponentActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onStateChanged(Lg71;Lt61;)V
    .locals 2

    .line 1
    iget v0, p0, Lwx;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lwx;->b:Landroidx/activity/ComponentActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Lt61;->ON_CREATE:Lt61;

    .line 9
    .line 10
    if-ne p2, p0, :cond_0

    .line 11
    .line 12
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 p2, 0x21

    .line 15
    .line 16
    if-lt p0, p2, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Landroidx/activity/ComponentActivity;->access$100(Landroidx/activity/ComponentActivity;)Lsp1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p1, Landroidx/activity/ComponentActivity;

    .line 23
    .line 24
    invoke-static {p1}, Lxx;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lsp1;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 35
    .line 36
    iget-boolean p1, p0, Lsp1;->g:Z

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lsp1;->c(Z)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_0
    invoke-virtual {v1}, Landroidx/activity/ComponentActivity;->ensureViewModelStore()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/activity/ComponentActivity;->getLifecycle()Lv61;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1, p0}, Lv61;->b(Lf71;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    sget-object p0, Lt61;->ON_STOP:Lt61;

    .line 54
    .line 55
    if-ne p2, p0, :cond_2

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/4 p0, 0x0

    .line 69
    :goto_0
    if-eqz p0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lfj1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lg71;


# instance fields
.field public U:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

.field public final V:Ly00;

.field public final W:La02;

.field public X:Landroid/util/Size;

.field public Y:Landroid/util/Size;

.field public volatile Z:Z

.field public final a:Landroid/app/Activity;

.field public a0:I

.field public final b:Lio/flutter/view/TextureRegistry;

.field public final b0:Lx6;

.field public final c:Lgj1;

.field public final d:Lgj1;

.field public final e:Lgj1;

.field public final f:Li71;

.field public i:Lsx1;

.field public v:Ly61;

.field public w:Lvw1;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/flutter/view/TextureRegistry;Lgj1;Lgj1;Lgj1;)V
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
    iput-object p1, p0, Lfj1;->a:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p2, p0, Lfj1;->b:Lio/flutter/view/TextureRegistry;

    .line 13
    .line 14
    iput-object p3, p0, Lfj1;->c:Lgj1;

    .line 15
    .line 16
    iput-object p4, p0, Lfj1;->d:Lgj1;

    .line 17
    .line 18
    iput-object p5, p0, Lfj1;->e:Lgj1;

    .line 19
    .line 20
    new-instance p1, Li71;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Li71;-><init>(Lg71;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lfj1;->f:Li71;

    .line 26
    .line 27
    sget-object p1, Lz80;->a:Lm60;

    .line 28
    .line 29
    invoke-static {p1}, Lk50;->a(Lkotlin/coroutines/CoroutineContext;)Ly00;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lfj1;->V:Ly00;

    .line 34
    .line 35
    new-instance p1, La02;

    .line 36
    .line 37
    invoke-direct {p1}, La02;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lfj1;->W:La02;

    .line 41
    .line 42
    new-instance p1, Lx6;

    .line 43
    .line 44
    const/16 p2, 0x9

    .line 45
    .line 46
    invoke-direct {p1, p0, p2}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lfj1;->b0:Lx6;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    iget-object p0, p0, Lfj1;->a:Landroid/app/Activity;

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lw0;->i(Landroid/app/Activity;)Landroid/view/Display;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "window"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p0, Landroid/view/WindowManager;

    .line 27
    .line 28
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    invoke-virtual {p0}, Landroid/view/Display;->getRotation()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_4

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    if-eq p0, v0, :cond_3

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    if-eq p0, v0, :cond_2

    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    if-eq p0, v0, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/16 p0, 0x10e

    .line 49
    .line 50
    return p0

    .line 51
    :cond_2
    const/16 p0, 0xb4

    .line 52
    .line 53
    return p0

    .line 54
    :cond_3
    const/16 p0, 0x5a

    .line 55
    .line 56
    return p0

    .line 57
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method public final getLifecycle()Lv61;
    .locals 0

    .line 1
    iget-object p0, p0, Lfj1;->f:Li71;

    .line 2
    .line 3
    return-object p0
.end method

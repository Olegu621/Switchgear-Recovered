.class public Lwc0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ldd0;
.implements Lfk0;
.implements Lcom/android/installreferrer/api/InstallReferrerStateListener;
.implements Lsg0;
.implements Lxo0;
.implements Lw02;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwc0;->a:I

    packed-switch p1, :pswitch_data_0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 111
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    return-void

    .line 112
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 114
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 107
    iput p1, p0, Lwc0;->a:I

    iput-object p2, p0, Lwc0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lwc0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 64
    iput p1, p0, Lwc0;->a:I

    iput-object p2, p0, Lwc0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 65
    iput p1, p0, Lwc0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lwc0;->a:I

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 104
    iput-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 105
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 106
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwc0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v1, Lid0;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Lid0;-><init>(Landroid/widget/EditText;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lwc0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lxc0;->b:Lxc0;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Lxc0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter p0

    .line 26
    :try_start_0
    sget-object v1, Lxc0;->b:Lxc0;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    new-instance v1, Lxc0;

    .line 31
    .line 32
    invoke-direct {v1}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    .line 34
    .line 35
    :try_start_1
    const-string v2, "android.text.DynamicLayout$ChangeWatcher"

    .line 36
    .line 37
    const-class v3, Lxc0;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v2, v0, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lxc0;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    :catchall_0
    :try_start_2
    sput-object v1, Lxc0;->b:Lxc0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    monitor-exit p0

    .line 55
    goto :goto_2

    .line 56
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    throw p1

    .line 58
    :cond_1
    :goto_2
    sget-object p0, Lxc0;->b:Lxc0;

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/w;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lwc0;->a:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 70
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lhe3;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lwc0;->a:I

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lwc0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lwc0;->a:I

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    .line 68
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 66
    iput p2, p0, Lwc0;->a:I

    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    iput p2, p0, Lwc0;->a:I

    packed-switch p2, :pswitch_data_0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    const-class p2, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 96
    sget-object v0, Lf80;->a:Ler0;

    invoke-virtual {v0, p2}, Ler0;->h(Ljava/lang/Class;)Lh02;

    move-result-object p2

    .line 97
    check-cast p2, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedOutputSizeQuirk;

    iput-object p2, p0, Lwc0;->b:Ljava/lang/Object;

    .line 98
    new-instance p2, Lr4;

    const/4 v0, 0x6

    invoke-direct {p2, p1, v0}, Lr4;-><init>(Ljava/lang/String;I)V

    iput-object p2, p0, Lwc0;->c:Ljava/lang/Object;

    return-void

    .line 99
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 102
    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, Lwc0;->a:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Lid;

    .line 73
    invoke-direct {v0}, Lle2;-><init>()V

    .line 74
    iput-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 75
    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljx1;)V
    .locals 2

    const/16 v0, 0x18

    iput v0, p0, Lwc0;->a:I

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    new-instance v0, Ljava/util/HashMap;

    .line 89
    iget-object v1, p1, Ljx1;->a:Ljava/util/HashMap;

    .line 90
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 91
    new-instance v0, Ljava/util/HashMap;

    .line 92
    iget-object p1, p1, Ljx1;->b:Ljava/util/HashMap;

    .line 93
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwq0;[I)V
    .locals 3

    const/16 v0, 0xa

    iput v0, p0, Lwc0;->a:I

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    array-length v0, p2

    if-eqz v0, :cond_3

    .line 78
    iput-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 79
    array-length p1, p2

    const/4 v0, 0x1

    if-le p1, v0, :cond_2

    const/4 v1, 0x0

    .line 80
    aget v2, p2, v1

    if-nez v2, :cond_2

    :goto_0
    if-ge v0, p1, :cond_0

    .line 81
    aget v2, p2, v0

    if-nez v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    .line 82
    filled-new-array {v1}, [I

    move-result-object p1

    iput-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    sub-int/2addr p1, v0

    .line 83
    new-array v2, p1, [I

    iput-object v2, p0, Lwc0;->c:Ljava/lang/Object;

    .line 84
    invoke-static {p2, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 85
    :cond_2
    iput-object p2, p0, Lwc0;->c:Ljava/lang/Object;

    :goto_1
    return-void

    .line 86
    :cond_3
    invoke-static {}, Lf42;->e()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static x(II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    const/4 v4, 0x1

    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x1

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    move v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    if-le v2, p1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    move v2, v4

    .line 21
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v2, v4

    .line 25
    if-le v2, p1, :cond_3

    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    :cond_3
    return v3
.end method


# virtual methods
.method public A(I)Lwc0;
    .locals 5

    .line 1
    iget-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    iget-object v1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lwq0;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p0, v1, Lwq0;->c:Lwc0;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    if-ne p1, v2, :cond_1

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    array-length p0, v0

    .line 19
    new-array v2, p0, [I

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, p0, :cond_2

    .line 23
    .line 24
    aget v4, v0, v3

    .line 25
    .line 26
    invoke-virtual {v1, v4, p1}, Lwq0;->b(II)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    aput v4, v2, v3

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    new-instance p0, Lwc0;

    .line 36
    .line 37
    invoke-direct {p0, v1, v2}, Lwc0;-><init>(Lwq0;[I)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public B(Lr42;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/EnumMap;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/EnumMap;

    .line 8
    .line 9
    const-class v1, Lr42;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/EnumMap;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "Authentication failure, reason: "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "HSEvntPrxy"

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lra2;

    .line 16
    .line 17
    new-instance v1, Ldp0;

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, p0, p1, v2, v3}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public D(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Event occurred: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const-string v2, "HSEvntPrxy"

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lra2;

    .line 24
    .line 25
    new-instance v1, Ljs0;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v1, v2, p0, p1, p2}, Ljs0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public E(Lk;Lif1;Ltd1;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v2, v2, Lwc0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ltf1;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v4, Ly91;

    .line 17
    .line 18
    iget-object v5, v2, Ltf1;->a:Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Ljava/util/Date;

    .line 25
    .line 26
    iget-object v6, v1, Lif1;->a:Ljava/lang/Double;

    .line 27
    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    :goto_0
    iget-object v8, v1, Lif1;->m:Ljava/lang/Double;

    .line 38
    .line 39
    if-eqz v8, :cond_1

    .line 40
    .line 41
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 47
    .line 48
    :goto_1
    iget-object v10, v1, Lif1;->j:Ljava/lang/Boolean;

    .line 49
    .line 50
    if-eqz v10, :cond_2

    .line 51
    .line 52
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/4 v10, 0x1

    .line 58
    :goto_2
    iget-object v1, v1, Lif1;->i:Ljava/lang/Boolean;

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    move v1, v11

    .line 69
    :goto_3
    sget-object v13, Lwd1;->a:Lwd1;

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    iget-object v3, v3, Ltd1;->c:Lwd1;

    .line 74
    .line 75
    if-nez v3, :cond_5

    .line 76
    .line 77
    :cond_4
    move-object v3, v13

    .line 78
    :cond_5
    if-ne v3, v13, :cond_6

    .line 79
    .line 80
    const/4 v11, 0x1

    .line 81
    :cond_6
    move-object v3, v4

    .line 82
    move-object v4, v5

    .line 83
    move-wide v5, v6

    .line 84
    move-wide v7, v8

    .line 85
    move v9, v10

    .line 86
    move v10, v1

    .line 87
    invoke-direct/range {v3 .. v11}, Ly91;-><init>(Ljava/util/Date;DDZZZ)V

    .line 88
    .line 89
    .line 90
    iget-object v1, v2, Ltf1;->f:Ljava/util/LinkedHashSet;

    .line 91
    .line 92
    iget-object v7, v2, Ltf1;->b:Ljava/util/Date;

    .line 93
    .line 94
    if-eqz v7, :cond_8

    .line 95
    .line 96
    if-nez v11, :cond_7

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_7
    const/16 p0, 0x1

    .line 100
    .line 101
    goto/16 :goto_a

    .line 102
    .line 103
    :cond_8
    :goto_4
    iget-object v7, v2, Ltf1;->g:Ly91;

    .line 104
    .line 105
    if-eqz v7, :cond_7

    .line 106
    .line 107
    iget-object v8, v7, Ly91;->a:Ljava/util/Date;

    .line 108
    .line 109
    invoke-static {v8, v4}, Ltf1;->b(Ljava/util/Date;Ljava/util/Date;)J

    .line 110
    .line 111
    .line 112
    move-result-wide v10

    .line 113
    iget-boolean v8, v7, Ly91;->d:Z

    .line 114
    .line 115
    if-eqz v8, :cond_9

    .line 116
    .line 117
    iget-wide v7, v2, Ltf1;->k:J

    .line 118
    .line 119
    invoke-static {v7, v8, v10, v11}, Lfb0;->g(JJ)J

    .line 120
    .line 121
    .line 122
    move-result-wide v7

    .line 123
    iput-wide v7, v2, Ltf1;->k:J

    .line 124
    .line 125
    const/16 p0, 0x1

    .line 126
    .line 127
    goto/16 :goto_9

    .line 128
    .line 129
    :cond_9
    iget-wide v13, v2, Ltf1;->i:J

    .line 130
    .line 131
    invoke-static {v13, v14, v10, v11}, Lfb0;->g(JJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide v13

    .line 135
    iput-wide v13, v2, Ltf1;->i:J

    .line 136
    .line 137
    iget-wide v13, v2, Ltf1;->e:J

    .line 138
    .line 139
    move-wide/from16 p2, v13

    .line 140
    .line 141
    const/16 p0, 0x1

    .line 142
    .line 143
    iget-wide v12, v7, Ly91;->c:D

    .line 144
    .line 145
    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-nez v8, :cond_f

    .line 150
    .line 151
    const-wide v14, 0x41dfffffffc00000L    # 2.147483647E9

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    cmpl-double v8, v12, v14

    .line 157
    .line 158
    if-lez v8, :cond_a

    .line 159
    .line 160
    const v8, 0x7fffffff

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_a
    const-wide/high16 v14, -0x3e20000000000000L    # -2.147483648E9

    .line 165
    .line 166
    cmpg-double v8, v12, v14

    .line 167
    .line 168
    if-gez v8, :cond_b

    .line 169
    .line 170
    const/high16 v8, -0x80000000

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_b
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 174
    .line 175
    .line 176
    move-result-wide v14

    .line 177
    long-to-int v8, v14

    .line 178
    :goto_5
    int-to-double v14, v8

    .line 179
    cmpg-double v14, v14, v12

    .line 180
    .line 181
    if-nez v14, :cond_c

    .line 182
    .line 183
    invoke-static {v8, v10, v11}, Lfb0;->h(IJ)J

    .line 184
    .line 185
    .line 186
    move-result-wide v12

    .line 187
    :goto_6
    move-wide/from16 v14, p2

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_c
    invoke-static {v10, v11}, Lfb0;->e(J)Lib0;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-static {v10, v11, v8}, Lfb0;->i(JLib0;)D

    .line 195
    .line 196
    .line 197
    move-result-wide v14

    .line 198
    mul-double/2addr v14, v12

    .line 199
    invoke-static {v14, v15, v8}, Lmn0;->C(DLib0;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v12

    .line 203
    goto :goto_6

    .line 204
    :goto_7
    invoke-static {v14, v15, v12, v13}, Lfb0;->g(JJ)J

    .line 205
    .line 206
    .line 207
    move-result-wide v12

    .line 208
    iput-wide v12, v2, Ltf1;->e:J

    .line 209
    .line 210
    iget-boolean v8, v7, Ly91;->e:Z

    .line 211
    .line 212
    if-eqz v8, :cond_d

    .line 213
    .line 214
    iget-wide v12, v2, Ltf1;->j:J

    .line 215
    .line 216
    invoke-static {v12, v13, v10, v11}, Lfb0;->g(JJ)J

    .line 217
    .line 218
    .line 219
    move-result-wide v10

    .line 220
    iput-wide v10, v2, Ltf1;->j:J

    .line 221
    .line 222
    :cond_d
    if-nez v9, :cond_e

    .line 223
    .line 224
    iget-wide v7, v7, Ly91;->b:D

    .line 225
    .line 226
    cmpl-double v10, v5, v7

    .line 227
    .line 228
    if-lez v10, :cond_e

    .line 229
    .line 230
    double-to-int v7, v7

    .line 231
    double-to-int v8, v5

    .line 232
    :goto_8
    if-ge v7, v8, :cond_e

    .line 233
    .line 234
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-interface {v1, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    add-int/lit8 v7, v7, 0x1

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_e
    :goto_9
    if-nez v9, :cond_10

    .line 245
    .line 246
    double-to-int v7, v5

    .line 247
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_f
    const-string v0, "Cannot round NaN value."

    .line 256
    .line 257
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_10
    :goto_a
    instance-of v1, v0, Lvd1;

    .line 262
    .line 263
    if-eqz v1, :cond_11

    .line 264
    .line 265
    iget v1, v2, Ltf1;->m:I

    .line 266
    .line 267
    add-int/lit8 v1, v1, 0x1

    .line 268
    .line 269
    iput v1, v2, Ltf1;->m:I

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_11
    instance-of v1, v0, Lhe1;

    .line 273
    .line 274
    if-eqz v1, :cond_12

    .line 275
    .line 276
    iget v1, v2, Ltf1;->n:I

    .line 277
    .line 278
    add-int/lit8 v1, v1, 0x1

    .line 279
    .line 280
    iput v1, v2, Ltf1;->n:I

    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_12
    instance-of v1, v0, Lge1;

    .line 284
    .line 285
    if-eqz v1, :cond_13

    .line 286
    .line 287
    iget v1, v2, Ltf1;->o:I

    .line 288
    .line 289
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    iput v1, v2, Ltf1;->o:I

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_13
    instance-of v1, v0, Lxd1;

    .line 295
    .line 296
    if-eqz v1, :cond_14

    .line 297
    .line 298
    iget v1, v2, Ltf1;->p:I

    .line 299
    .line 300
    add-int/lit8 v1, v1, 0x1

    .line 301
    .line 302
    iput v1, v2, Ltf1;->p:I

    .line 303
    .line 304
    :cond_14
    :goto_b
    instance-of v1, v0, Lhe1;

    .line 305
    .line 306
    if-eqz v1, :cond_15

    .line 307
    .line 308
    move/from16 v1, p0

    .line 309
    .line 310
    goto :goto_c

    .line 311
    :cond_15
    instance-of v1, v0, Lfe1;

    .line 312
    .line 313
    :goto_c
    const/4 v7, 0x0

    .line 314
    if-eqz v1, :cond_16

    .line 315
    .line 316
    iget-object v1, v2, Ltf1;->b:Ljava/util/Date;

    .line 317
    .line 318
    if-nez v1, :cond_1f

    .line 319
    .line 320
    iput-object v4, v2, Ltf1;->b:Ljava/util/Date;

    .line 321
    .line 322
    goto :goto_12

    .line 323
    :cond_16
    instance-of v1, v0, Lxd1;

    .line 324
    .line 325
    if-eqz v1, :cond_17

    .line 326
    .line 327
    move/from16 v1, p0

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :cond_17
    instance-of v1, v0, Lce1;

    .line 331
    .line 332
    :goto_d
    if-eqz v1, :cond_18

    .line 333
    .line 334
    move/from16 v1, p0

    .line 335
    .line 336
    goto :goto_e

    .line 337
    :cond_18
    instance-of v1, v0, Lde1;

    .line 338
    .line 339
    :goto_e
    if-eqz v1, :cond_19

    .line 340
    .line 341
    move/from16 v1, p0

    .line 342
    .line 343
    goto :goto_f

    .line 344
    :cond_19
    instance-of v1, v0, Lie1;

    .line 345
    .line 346
    :goto_f
    if-eqz v1, :cond_1b

    .line 347
    .line 348
    iget-object v1, v2, Ltf1;->b:Ljava/util/Date;

    .line 349
    .line 350
    if-eqz v1, :cond_1a

    .line 351
    .line 352
    iget-wide v8, v2, Ltf1;->h:J

    .line 353
    .line 354
    invoke-static {v1, v4}, Ltf1;->b(Ljava/util/Date;Ljava/util/Date;)J

    .line 355
    .line 356
    .line 357
    move-result-wide v10

    .line 358
    invoke-static {v8, v9, v10, v11}, Lfb0;->g(JJ)J

    .line 359
    .line 360
    .line 361
    move-result-wide v8

    .line 362
    iput-wide v8, v2, Ltf1;->h:J

    .line 363
    .line 364
    :cond_1a
    iput-object v4, v2, Ltf1;->b:Ljava/util/Date;

    .line 365
    .line 366
    goto :goto_12

    .line 367
    :cond_1b
    instance-of v1, v0, Lyd1;

    .line 368
    .line 369
    if-eqz v1, :cond_1c

    .line 370
    .line 371
    move/from16 v1, p0

    .line 372
    .line 373
    goto :goto_10

    .line 374
    :cond_1c
    instance-of v1, v0, Lge1;

    .line 375
    .line 376
    :goto_10
    if-eqz v1, :cond_1d

    .line 377
    .line 378
    move/from16 v12, p0

    .line 379
    .line 380
    goto :goto_11

    .line 381
    :cond_1d
    instance-of v12, v0, Lee1;

    .line 382
    .line 383
    :goto_11
    if-eqz v12, :cond_1f

    .line 384
    .line 385
    iget-object v1, v2, Ltf1;->b:Ljava/util/Date;

    .line 386
    .line 387
    if-eqz v1, :cond_1e

    .line 388
    .line 389
    iget-wide v8, v2, Ltf1;->h:J

    .line 390
    .line 391
    invoke-static {v1, v4}, Ltf1;->b(Ljava/util/Date;Ljava/util/Date;)J

    .line 392
    .line 393
    .line 394
    move-result-wide v10

    .line 395
    invoke-static {v8, v9, v10, v11}, Lfb0;->g(JJ)J

    .line 396
    .line 397
    .line 398
    move-result-wide v8

    .line 399
    iput-wide v8, v2, Ltf1;->h:J

    .line 400
    .line 401
    :cond_1e
    iput-object v7, v2, Ltf1;->b:Ljava/util/Date;

    .line 402
    .line 403
    :cond_1f
    :goto_12
    instance-of v1, v0, Lte1;

    .line 404
    .line 405
    if-eqz v1, :cond_20

    .line 406
    .line 407
    iput-object v4, v2, Ltf1;->c:Ljava/util/Date;

    .line 408
    .line 409
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    iput-object v0, v2, Ltf1;->d:Ljava/lang/Double;

    .line 414
    .line 415
    goto :goto_15

    .line 416
    :cond_20
    iget-object v1, v2, Ltf1;->c:Ljava/util/Date;

    .line 417
    .line 418
    if-nez v1, :cond_21

    .line 419
    .line 420
    goto :goto_15

    .line 421
    :cond_21
    iget-object v8, v2, Ltf1;->d:Ljava/lang/Double;

    .line 422
    .line 423
    if-eqz v8, :cond_25

    .line 424
    .line 425
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 426
    .line 427
    .line 428
    move-result-wide v8

    .line 429
    cmpg-double v5, v5, v8

    .line 430
    .line 431
    if-nez v5, :cond_22

    .line 432
    .line 433
    goto :goto_13

    .line 434
    :cond_22
    iget-boolean v5, v3, Ly91;->d:Z

    .line 435
    .line 436
    if-eqz v5, :cond_24

    .line 437
    .line 438
    :goto_13
    instance-of v5, v0, Lse1;

    .line 439
    .line 440
    if-nez v5, :cond_24

    .line 441
    .line 442
    instance-of v0, v0, Lff1;

    .line 443
    .line 444
    if-eqz v0, :cond_23

    .line 445
    .line 446
    goto :goto_14

    .line 447
    :cond_23
    iget-wide v5, v2, Ltf1;->l:J

    .line 448
    .line 449
    invoke-static {v1, v4}, Ltf1;->b(Ljava/util/Date;Ljava/util/Date;)J

    .line 450
    .line 451
    .line 452
    move-result-wide v0

    .line 453
    invoke-static {v5, v6, v0, v1}, Lfb0;->g(JJ)J

    .line 454
    .line 455
    .line 456
    move-result-wide v0

    .line 457
    iput-wide v0, v2, Ltf1;->l:J

    .line 458
    .line 459
    iput-object v4, v2, Ltf1;->c:Ljava/util/Date;

    .line 460
    .line 461
    goto :goto_15

    .line 462
    :cond_24
    :goto_14
    iget-wide v5, v2, Ltf1;->l:J

    .line 463
    .line 464
    invoke-static {v1, v4}, Ltf1;->b(Ljava/util/Date;Ljava/util/Date;)J

    .line 465
    .line 466
    .line 467
    move-result-wide v0

    .line 468
    invoke-static {v5, v6, v0, v1}, Lfb0;->g(JJ)J

    .line 469
    .line 470
    .line 471
    move-result-wide v0

    .line 472
    iput-wide v0, v2, Ltf1;->l:J

    .line 473
    .line 474
    iput-object v7, v2, Ltf1;->c:Ljava/util/Date;

    .line 475
    .line 476
    iput-object v7, v2, Ltf1;->d:Ljava/lang/Double;

    .line 477
    .line 478
    :cond_25
    :goto_15
    iput-object v3, v2, Ltf1;->g:Ly91;

    .line 479
    .line 480
    return-void
.end method

.method public a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/lang/Boolean;

    .line 7
    .line 8
    return-object p0
.end method

.method public b()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lby2;

    .line 4
    .line 5
    return-object p0
.end method

.method public c(Ljava/lang/CharSequence;IILqs2;)Z
    .locals 3

    .line 1
    iget v0, p4, Lqs2;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lby2;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    new-instance v0, Lby2;

    .line 16
    .line 17
    instance-of v2, p1, Landroid/text/Spannable;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p1, Landroid/text/Spannable;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    .line 25
    .line 26
    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v2

    .line 30
    :goto_0
    invoke-direct {v0, p1}, Lby2;-><init>(Landroid/text/Spannable;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Lwc0;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lzb0;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Lrs2;

    .line 43
    .line 44
    invoke-direct {p1, p4}, Lrs2;-><init>(Lqs2;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lby2;

    .line 50
    .line 51
    const/16 p4, 0x21

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2, p3, p4}, Lby2;->setSpan(Ljava/lang/Object;III)V

    .line 54
    .line 55
    .line 56
    return v1
.end method

.method public collect(Lhk0;Lc10;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwc0;->a:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/high16 v2, -0x80000000

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lfk0;

    .line 15
    .line 16
    new-instance v1, Lh90;

    .line 17
    .line 18
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lil0;

    .line 21
    .line 22
    invoke-direct {v1, p1, p0}, Lh90;-><init>(Lhk0;Lil0;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1, p2}, Lfk0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object p1, Lz10;->a:Lz10;

    .line 30
    .line 31
    if-ne p0, p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    :goto_0
    return-object p0

    .line 37
    :pswitch_0
    instance-of v0, p2, Lpk0;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    move-object v0, p2

    .line 42
    check-cast v0, Lpk0;

    .line 43
    .line 44
    iget v5, v0, Lpk0;->b:I

    .line 45
    .line 46
    and-int v6, v5, v2

    .line 47
    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    sub-int/2addr v5, v2

    .line 51
    iput v5, v0, Lpk0;->b:I

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance v0, Lpk0;

    .line 55
    .line 56
    invoke-direct {v0, p0, p2}, Lpk0;-><init>(Lwc0;Lc10;)V

    .line 57
    .line 58
    .line 59
    :goto_1
    iget-object p2, v0, Lpk0;->a:Ljava/lang/Object;

    .line 60
    .line 61
    sget-object v2, Lz10;->a:Lz10;

    .line 62
    .line 63
    iget v5, v0, Lpk0;->b:I

    .line 64
    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    if-ne v5, v3, :cond_2

    .line 68
    .line 69
    iget-object p0, v0, Lpk0;->d:Lh90;

    .line 70
    .line 71
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch La; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :catch_0
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-static {v1}, Lf42;->l(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p0, Lwc0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p2, Lwc0;

    .line 87
    .line 88
    new-instance v1, Lh90;

    .line 89
    .line 90
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lmj;

    .line 93
    .line 94
    invoke-direct {v1, p0, p1}, Lh90;-><init>(Lmj;Lhk0;)V

    .line 95
    .line 96
    .line 97
    :try_start_1
    iput-object v1, v0, Lpk0;->d:Lh90;

    .line 98
    .line 99
    iput v3, v0, Lpk0;->b:I

    .line 100
    .line 101
    invoke-virtual {p2, v1, v0}, Lwc0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0
    :try_end_1
    .catch La; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    if-ne p0, v2, :cond_4

    .line 106
    .line 107
    move-object v4, v2

    .line 108
    goto :goto_4

    .line 109
    :catch_1
    move-exception p1

    .line 110
    move-object p0, v1

    .line 111
    :goto_2
    iget-object p2, p1, La;->a:Ljava/lang/Object;

    .line 112
    .line 113
    if-ne p2, p0, :cond_5

    .line 114
    .line 115
    :cond_4
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_4
    return-object v4

    .line 118
    :cond_5
    throw p1

    .line 119
    :pswitch_1
    new-instance v0, Le22;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Lwc0;

    .line 127
    .line 128
    new-instance v2, Lok0;

    .line 129
    .line 130
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, Lqh;

    .line 133
    .line 134
    invoke-direct {v2, v0, p1, p0}, Lok0;-><init>(Le22;Lhk0;Lqh;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2, p2}, Lwc0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    sget-object p1, Lz10;->a:Lz10;

    .line 142
    .line 143
    if-ne p0, p1, :cond_6

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_5
    return-object p0

    .line 149
    :pswitch_2
    instance-of v0, p2, Lmk0;

    .line 150
    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    move-object v0, p2

    .line 154
    check-cast v0, Lmk0;

    .line 155
    .line 156
    iget v5, v0, Lmk0;->b:I

    .line 157
    .line 158
    and-int v6, v5, v2

    .line 159
    .line 160
    if-eqz v6, :cond_7

    .line 161
    .line 162
    sub-int/2addr v5, v2

    .line 163
    iput v5, v0, Lmk0;->b:I

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_7
    new-instance v0, Lmk0;

    .line 167
    .line 168
    invoke-direct {v0, p0, p2}, Lmk0;-><init>(Lwc0;Lc10;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    iget-object p2, v0, Lmk0;->a:Ljava/lang/Object;

    .line 172
    .line 173
    sget-object v2, Lz10;->a:Lz10;

    .line 174
    .line 175
    iget v5, v0, Lmk0;->b:I

    .line 176
    .line 177
    const/4 v6, 0x2

    .line 178
    if-eqz v5, :cond_a

    .line 179
    .line 180
    if-eq v5, v3, :cond_9

    .line 181
    .line 182
    if-ne v5, v6, :cond_8

    .line 183
    .line 184
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_8
    invoke-static {v1}, Lf42;->l(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_a

    .line 192
    :cond_9
    iget-object p0, v0, Lmk0;->f:Lw52;

    .line 193
    .line 194
    iget-object p1, v0, Lmk0;->e:Lhk0;

    .line 195
    .line 196
    iget-object v1, v0, Lmk0;->d:Lwc0;

    .line 197
    .line 198
    :try_start_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    .line 200
    .line 201
    goto :goto_7

    .line 202
    :catchall_0
    move-exception p1

    .line 203
    goto :goto_c

    .line 204
    :cond_a
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    new-instance p2, Lw52;

    .line 208
    .line 209
    invoke-interface {v0}, Lc10;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-direct {p2, p1, v1}, Lw52;-><init>(Lhk0;Lkotlin/coroutines/CoroutineContext;)V

    .line 214
    .line 215
    .line 216
    :try_start_3
    iget-object v1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v1, Ln40;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 219
    .line 220
    :try_start_4
    iput-object p0, v0, Lmk0;->d:Lwc0;

    .line 221
    .line 222
    iput-object p1, v0, Lmk0;->e:Lhk0;

    .line 223
    .line 224
    iput-object p2, v0, Lmk0;->f:Lw52;

    .line 225
    .line 226
    iput v3, v0, Lmk0;->b:I

    .line 227
    .line 228
    invoke-virtual {v1, p2, v0}, Ln40;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 232
    if-ne v1, v2, :cond_b

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_b
    move-object v1, p0

    .line 236
    move-object p0, p2

    .line 237
    :goto_7
    invoke-virtual {p0}, Ld10;->releaseIntercepted()V

    .line 238
    .line 239
    .line 240
    iget-object p0, v1, Lwc0;->c:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p0, Lfk0;

    .line 243
    .line 244
    iput-object v4, v0, Lmk0;->d:Lwc0;

    .line 245
    .line 246
    iput-object v4, v0, Lmk0;->e:Lhk0;

    .line 247
    .line 248
    iput-object v4, v0, Lmk0;->f:Lw52;

    .line 249
    .line 250
    iput v6, v0, Lmk0;->b:I

    .line 251
    .line 252
    invoke-interface {p0, p1, v0}, Lfk0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    if-ne p0, v2, :cond_c

    .line 257
    .line 258
    :goto_8
    move-object v4, v2

    .line 259
    goto :goto_a

    .line 260
    :cond_c
    :goto_9
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    :goto_a
    return-object v4

    .line 263
    :catchall_1
    move-exception p1

    .line 264
    :goto_b
    move-object p0, p2

    .line 265
    goto :goto_c

    .line 266
    :catchall_2
    move-exception p0

    .line 267
    move-object p1, p0

    .line 268
    goto :goto_b

    .line 269
    :goto_c
    invoke-virtual {p0}, Ld10;->releaseIntercepted()V

    .line 270
    .line 271
    .line 272
    throw p1

    .line 273
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "="

    .line 22
    .line 23
    invoke-static {v2, p2, v0, p1}, Lfm0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public e(Lwc0;)Lwc0;
    .locals 7

    .line 1
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwq0;

    .line 4
    .line 5
    iget-object v1, p1, Lwc0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lwq0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0}, Lwc0;->z()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-virtual {p1}, Lwc0;->z()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, [I

    .line 32
    .line 33
    iget-object p1, p1, Lwc0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, [I

    .line 36
    .line 37
    array-length v1, p0

    .line 38
    array-length v2, p1

    .line 39
    if-le v1, v2, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v6, p1

    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v6

    .line 45
    :goto_0
    array-length v1, p0

    .line 46
    new-array v1, v1, [I

    .line 47
    .line 48
    array-length v2, p0

    .line 49
    array-length v3, p1

    .line 50
    sub-int/2addr v2, v3

    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-static {p0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    move v3, v2

    .line 56
    :goto_1
    array-length v4, p0

    .line 57
    if-ge v3, v4, :cond_3

    .line 58
    .line 59
    sub-int v4, v3, v2

    .line 60
    .line 61
    aget v4, p1, v4

    .line 62
    .line 63
    aget v5, p0, v3

    .line 64
    .line 65
    xor-int/2addr v4, v5

    .line 66
    aput v4, v1, v3

    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    new-instance p0, Lwc0;

    .line 72
    .line 73
    invoke-direct {p0, v0, v1}, Lwc0;-><init>(Lwq0;[I)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_4
    const-string p0, "GenericGFPolys do not have same GenericGF field"

    .line 78
    .line 79
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    return-object p0
.end method

.method public f(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->f(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public g(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/fragment/app/w;->v:Lom0;

    .line 9
    .line 10
    iget-object v1, v1, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, p1, v1}, Lwc0;->g(Landroidx/fragment/app/Fragment;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    throw p0

    .line 53
    :cond_1
    throw p0

    .line 54
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwc0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v2, Lq62;

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    invoke-direct {v2, v0}, Lq62;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lp62;

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    invoke-direct {v3, v0}, Lp62;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljavax/inject/Provider;

    .line 23
    .line 24
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, p0

    .line 31
    check-cast v6, Ljavax/inject/Provider;

    .line 32
    .line 33
    new-instance v1, Ls52;

    .line 34
    .line 35
    move-object v5, v0

    .line 36
    check-cast v5, Lk72;

    .line 37
    .line 38
    sget-object v4, Lsf;->f:Lsf;

    .line 39
    .line 40
    invoke-direct/range {v1 .. v6}, Ls52;-><init>(Lyv;Lyv;Lsf;Lk72;Ljavax/inject/Provider;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :pswitch_0
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ld1;

    .line 47
    .line 48
    iget-object v0, v0, Ld1;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroid/content/Context;

    .line 51
    .line 52
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Ld52;

    .line 55
    .line 56
    invoke-virtual {p0}, Ld52;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v1, Lei1;

    .line 61
    .line 62
    check-cast p0, Lec;

    .line 63
    .line 64
    invoke-direct {v1, v0, p0}, Lei1;-><init>(Landroid/content/Context;Lec;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public h(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->h(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public i(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->i(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public j(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->j(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public k(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->k(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public l(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/fragment/app/w;->v:Lom0;

    .line 9
    .line 10
    iget-object v1, v1, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, p1, v1}, Lwc0;->l(Landroidx/fragment/app/Fragment;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    throw p0

    .line 53
    :cond_1
    throw p0

    .line 54
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method

.method public m(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->m(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public n(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->n(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public o(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, p2, v1}, Lwc0;->o(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p3, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, Lwc0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lum;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "Future should never fail. Did it get completed by GC?"

    .line 17
    .line 18
    invoke-direct {p0, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public onInstallReferrerServiceDisconnected()V
    .locals 0

    .line 1
    return-void
.end method

.method public onInstallReferrerSetupFinished(I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Loc;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const-string v3, "oy0"

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    if-eq p1, p0, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x2

    .line 15
    if-eq p1, p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "Install referrer API not available on the current Play Store app."

    .line 19
    .line 20
    new-array p1, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {v3, p0, p1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const-string p0, "Install referrer API connection couldn\'t be established."

    .line 30
    .line 31
    new-array p1, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v3, p0, p1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    :try_start_0
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lcom/android/installreferrer/api/InstallReferrerClient;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/android/installreferrer/api/InstallReferrerClient;->getInstallReferrer()Lcom/android/installreferrer/api/ReferrerDetails;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v4, Loy0;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallReferrer()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/android/installreferrer/api/ReferrerDetails;->getReferrerClickTimestampSeconds()J

    .line 61
    .line 62
    .line 63
    move-result-wide v7

    .line 64
    invoke-virtual {p0}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallBeginTimestampSeconds()J

    .line 65
    .line 66
    .line 67
    move-result-wide v9

    .line 68
    invoke-virtual {p0}, Lcom/android/installreferrer/api/ReferrerDetails;->getGooglePlayInstantParam()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-direct/range {v4 .. v10}, Loy0;-><init>(ZLjava/lang/String;JJ)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v4}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catch_0
    const-string p0, "Upgrade InstallReferrer package to v1.1 or higher to add the install referrer details entity."

    .line 80
    .line 81
    new-array p1, v2, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v3, p0, p1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_1
    const-string p0, "Install referrer API remote exception."

    .line 91
    .line 92
    new-array p1, v2, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v3, p0, p1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :goto_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lwc0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Void;

    .line 7
    .line 8
    iget-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lum;

    .line 11
    .line 12
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lvq;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lum;->a(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast p1, Ljava/lang/Void;

    .line 21
    .line 22
    iget-object p1, p0, Lwc0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/view/Surface;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Landroid/graphics/SurfaceTexture;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public p(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->p(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public q(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->q(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public r(Landroidx/fragment/app/Fragment;Landroid/view/View;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/fragment/app/w;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, p1, p2, v1}, Lwc0;->r(Landroidx/fragment/app/Fragment;Landroid/view/View;Z)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-nez p0, :cond_2

    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    if-eqz p3, :cond_1

    .line 50
    .line 51
    throw p0

    .line 52
    :cond_1
    throw p0

    .line 53
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method

.method public s(Landroidx/fragment/app/Fragment;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroidx/fragment/app/w;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/w;->x:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/w;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Landroidx/fragment/app/w;->n:Lwc0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p1, v1}, Lwc0;->s(Landroidx/fragment/app/Fragment;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    throw p0

    .line 50
    :cond_2
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public t(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lwc0;->v(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 v2, 0x1

    .line 14
    if-ne p1, v2, :cond_2

    .line 15
    .line 16
    array-length p0, v0

    .line 17
    move p1, v1

    .line 18
    :goto_0
    if-ge v1, p0, :cond_1

    .line 19
    .line 20
    aget v2, v0, v1

    .line 21
    .line 22
    sget-object v3, Lwq0;->h:Lwq0;

    .line 23
    .line 24
    xor-int/2addr p1, v2

    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return p1

    .line 29
    :cond_2
    aget v1, v0, v1

    .line 30
    .line 31
    array-length v3, v0

    .line 32
    :goto_1
    if-ge v2, v3, :cond_3

    .line 33
    .line 34
    iget-object v4, p0, Lwc0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Lwq0;

    .line 37
    .line 38
    invoke-virtual {v4, p1, v1}, Lwq0;->b(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    aget v4, v0, v2

    .line 43
    .line 44
    xor-int/2addr v1, v4

    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lwc0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sparse-switch v0, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :sswitch_0
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    return-object p0

    .line 17
    :sswitch_1
    iget-object v0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lqf2;

    .line 20
    .line 21
    const-string v2, "[ "

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    :goto_0
    const/16 v0, 0x9

    .line 26
    .line 27
    if-ge v1, v0, :cond_0

    .line 28
    .line 29
    invoke-static {v2}, Len;->p(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, p0, Lwc0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lqf2;

    .line 36
    .line 37
    iget-object v2, v2, Lqf2;->v:[F

    .line 38
    .line 39
    aget v2, v2, v1

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v2, " "

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const-string v0, "] "

    .line 57
    .line 58
    invoke-static {v2, v0}, Lfm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lqf2;

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v1, "ObservableProperty(value="

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const/16 p0, 0x29

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const/16 v2, 0x64

    .line 101
    .line 102
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Lwc0;->c:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const/16 v2, 0x7b

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    :goto_1
    if-ge v1, v2, :cond_2

    .line 132
    .line 133
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    add-int/lit8 v3, v2, -0x1

    .line 143
    .line 144
    if-ge v1, v3, :cond_1

    .line 145
    .line 146
    const-string v3, ", "

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_2
    const/16 p0, 0x7d

    .line 155
    .line 156
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :sswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-virtual {p0}, Lwc0;->w()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    mul-int/lit8 v1, v1, 0x8

    .line 171
    .line 172
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lwc0;->w()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    :goto_2
    if-ltz v1, :cond_c

    .line 180
    .line 181
    invoke-virtual {p0, v1}, Lwc0;->v(I)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_b

    .line 186
    .line 187
    if-gez v2, :cond_3

    .line 188
    .line 189
    const-string v3, " - "

    .line 190
    .line 191
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    neg-int v2, v2

    .line 195
    goto :goto_3

    .line 196
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-lez v3, :cond_4

    .line 201
    .line 202
    const-string v3, " + "

    .line 203
    .line 204
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    :cond_4
    :goto_3
    const/4 v3, 0x1

    .line 208
    if-eqz v1, :cond_5

    .line 209
    .line 210
    if-eq v2, v3, :cond_8

    .line 211
    .line 212
    :cond_5
    iget-object v4, p0, Lwc0;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v4, Lwq0;

    .line 215
    .line 216
    if-eqz v2, :cond_a

    .line 217
    .line 218
    iget-object v4, v4, Lwq0;->b:[I

    .line 219
    .line 220
    aget v2, v4, v2

    .line 221
    .line 222
    if-nez v2, :cond_6

    .line 223
    .line 224
    const/16 v2, 0x31

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_6
    if-ne v2, v3, :cond_7

    .line 231
    .line 232
    const/16 v2, 0x61

    .line 233
    .line 234
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_7
    const-string v4, "a^"

    .line 239
    .line 240
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    :cond_8
    :goto_4
    if-eqz v1, :cond_b

    .line 247
    .line 248
    if-ne v1, v3, :cond_9

    .line 249
    .line 250
    const/16 v2, 0x78

    .line 251
    .line 252
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_9
    const-string v2, "x^"

    .line 257
    .line 258
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-static {}, Lf42;->e()V

    .line 269
    .line 270
    .line 271
    const/4 p0, 0x0

    .line 272
    goto :goto_6

    .line 273
    :cond_b
    :goto_5
    add-int/lit8 v1, v1, -0x1

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    :goto_6
    return-object p0

    .line 281
    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_4
        0x15 -> :sswitch_3
        0x17 -> :sswitch_2
        0x19 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Ljava/lang/String;)Lcom/google/android/datatransport/cct/CctBackendFactory;
    .locals 13

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    const-string v1, "Could not instantiate "

    .line 4
    .line 5
    iget-object v2, p0, Lwc0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/Map;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, "BackendRegistry"

    .line 11
    .line 12
    if-nez v2, :cond_6

    .line 13
    .line 14
    iget-object v2, p0, Lwc0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroid/content/Context;

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    const-string v2, "Context has no PackageManager."

    .line 25
    .line 26
    invoke-static {v4, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :goto_0
    move-object v2, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance v6, Landroid/content/ComponentName;

    .line 32
    .line 33
    const-class v7, Lcom/google/android/datatransport/runtime/backends/TransportBackendDiscovery;

    .line 34
    .line 35
    invoke-direct {v6, v2, v7}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    const/16 v2, 0x80

    .line 39
    .line 40
    invoke-virtual {v5, v6, v2}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    const-string v2, "TransportBackendDiscovery has no service info."

    .line 47
    .line 48
    invoke-static {v4, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    const-string v2, "Application info not found."

    .line 56
    .line 57
    invoke-static {v4, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    if-nez v2, :cond_2

    .line 62
    .line 63
    const-string v2, "Could not retrieve metadata, returning empty list of transport backends."

    .line 64
    .line 65
    invoke-static {v4, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_2
    new-instance v5, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    instance-of v9, v8, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v9, :cond_3

    .line 103
    .line 104
    const-string v9, "backend:"

    .line 105
    .line 106
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_3

    .line 111
    .line 112
    check-cast v8, Ljava/lang/String;

    .line 113
    .line 114
    const-string v9, ","

    .line 115
    .line 116
    const/4 v10, -0x1

    .line 117
    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    array-length v9, v8

    .line 122
    const/4 v10, 0x0

    .line 123
    :goto_2
    if-ge v10, v9, :cond_3

    .line 124
    .line 125
    aget-object v11, v8, v10

    .line 126
    .line 127
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-eqz v12, :cond_4

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    const/16 v12, 0x8

    .line 139
    .line 140
    invoke-virtual {v7, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    invoke-virtual {v5, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    move-object v2, v5

    .line 151
    :goto_4
    iput-object v2, p0, Lwc0;->c:Ljava/lang/Object;

    .line 152
    .line 153
    :cond_6
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, Ljava/util/Map;

    .line 156
    .line 157
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, Ljava/lang/String;

    .line 162
    .line 163
    if-nez p0, :cond_7

    .line 164
    .line 165
    goto/16 :goto_a

    .line 166
    .line 167
    :cond_7
    :try_start_1
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    const-class v2, Lcom/google/android/datatransport/cct/CctBackendFactory;

    .line 172
    .line 173
    invoke-virtual {p1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, Lcom/google/android/datatransport/cct/CctBackendFactory;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 186
    .line 187
    return-object p1

    .line 188
    :catch_1
    move-exception p1

    .line 189
    goto :goto_5

    .line 190
    :catch_2
    move-exception p1

    .line 191
    goto :goto_6

    .line 192
    :catch_3
    move-exception p1

    .line 193
    goto :goto_7

    .line 194
    :catch_4
    move-exception p1

    .line 195
    goto :goto_8

    .line 196
    :catch_5
    move-exception p1

    .line 197
    goto :goto_9

    .line 198
    :goto_5
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {v4, p0, p1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    goto :goto_a

    .line 206
    :goto_6
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {v4, p0, p1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    goto :goto_a

    .line 214
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-static {v4, p0, p1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    goto :goto_a

    .line 233
    :goto_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-static {v4, p0, p1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    goto :goto_a

    .line 252
    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    const-string v1, "Class "

    .line 255
    .line 256
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string p0, " is not found."

    .line 263
    .line 264
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-static {v4, p0, p1}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    :goto_a
    return-object v3
.end method

.method public v(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [I

    .line 4
    .line 5
    array-length v0, p0

    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    sub-int/2addr v0, p1

    .line 9
    aget p0, p0, v0

    .line 10
    .line 11
    return p0
.end method

.method public w()I
    .locals 0

    .line 1
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [I

    .line 4
    .line 5
    array-length p0, p0

    .line 6
    add-int/lit8 p0, p0, -0x1

    .line 7
    .line 8
    return p0
.end method

.method public y()V
    .locals 0

    .line 1
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/util/SparseIntArray;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lwc0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    aget p0, p0, v0

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    return v0
.end method

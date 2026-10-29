.class public final Lus;
.super Ljr2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lus;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkr2;Lid;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lus;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lus;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lus;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b(Landroidx/transition/Transition;)V
    .locals 0

    .line 1
    iget p1, p0, Lus;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lus;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lcr0;

    .line 10
    .line 11
    const/4 p1, 0x4

    .line 12
    invoke-interface {p0, p1}, Lcr0;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroidx/transition/Transition;)V
    .locals 4

    .line 1
    iget v0, p0, Lus;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lus;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lid;

    .line 10
    .line 11
    iget-object v2, p0, Lus;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lkr2;

    .line 14
    .line 15
    iget-object v2, v2, Lkr2;->b:Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->v(Lir2;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->v(Lir2;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lus;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Landroid/view/View;

    .line 36
    .line 37
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v0, 0x1c

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    sget-boolean p1, Ler0;->v:Z

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    :try_start_0
    sget-boolean p1, Ler0;->d:Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 49
    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    :try_start_1
    const-string p1, "android.view.GhostView"

    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sput-object p1, Ler0;->c:Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 59
    .line 60
    :catch_0
    :try_start_2
    sput-boolean v2, Ler0;->d:Z

    .line 61
    .line 62
    :cond_0
    sget-object p1, Ler0;->c:Ljava/lang/Class;

    .line 63
    .line 64
    const-string v0, "removeGhost"

    .line 65
    .line 66
    const-class v3, Landroid/view/View;

    .line 67
    .line 68
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {p1, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sput-object p1, Ler0;->i:Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    .line 79
    .line 80
    .line 81
    :catch_1
    sput-boolean v2, Ler0;->v:Z

    .line 82
    .line 83
    :cond_1
    sget-object p1, Ler0;->i:Ljava/lang/reflect/Method;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    :try_start_3
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_2

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catch_2
    move-exception p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    sget p1, Lfr0;->i:I

    .line 105
    .line 106
    sget p1, Landroidx/transition/R$id;->ghost_view:I

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Lfr0;

    .line 113
    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    iget v0, p1, Lfr0;->d:I

    .line 117
    .line 118
    sub-int/2addr v0, v2

    .line 119
    iput v0, p1, Lfr0;->d:I

    .line 120
    .line 121
    if-gtz v0, :cond_3

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ldr0;

    .line 128
    .line 129
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    :catch_3
    :cond_3
    :goto_0
    sget p1, Landroidx/transition/R$id;->transition_transform:I

    .line 133
    .line 134
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    sget p1, Landroidx/transition/R$id;->parent_matrix:I

    .line 138
    .line 139
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :goto_1
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroidx/transition/Transition;)V
    .locals 0

    .line 1
    iget p1, p0, Lus;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lus;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lcr0;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-interface {p0, p1}, Lcr0;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

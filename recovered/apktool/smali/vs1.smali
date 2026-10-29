.class public final Lvs1;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvs1;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 2
    .line 3
    iput-object p2, p0, Lvs1;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lvs1;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lvs1;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lvs1;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ltj2;-><init>(ILc10;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 7

    .line 1
    new-instance v0, Lvs1;

    .line 2
    .line 3
    iget-object v4, p0, Lvs1;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, Lvs1;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    iget-object v1, p0, Lvs1;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 8
    .line 9
    iget-object v2, p0, Lvs1;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lvs1;->d:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lvs1;-><init>(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly10;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lvs1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lvs1;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lvs1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lvs1;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lvs1;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v4, :cond_1

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v6

    .line 30
    :cond_1
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :try_start_1
    new-instance p1, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;

    .line 44
    .line 45
    iget-object v1, p0, Lvs1;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 46
    .line 47
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->access$getApplicationContext$p(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;)Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    iget-object v7, p0, Lvs1;->c:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v8, p0, Lvs1;->d:Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {p1, v1, v7, v8}, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lvs1;->e:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->loadSharedAccounts(Ljava/lang/String;)Le70;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput v5, p0, Lvs1;->a:I

    .line 67
    .line 68
    invoke-interface {p1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 76
    .line 77
    sget-object v1, Lz80;->a:Lm60;

    .line 78
    .line 79
    sget-object v1, Lgb1;->a:Lkt0;

    .line 80
    .line 81
    new-instance v5, Lts1;

    .line 82
    .line 83
    invoke-direct {v5, v2, p1, v6}, Lts1;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/util/List;Lc10;)V

    .line 84
    .line 85
    .line 86
    iput v4, p0, Lvs1;->a:I

    .line 87
    .line 88
    invoke-static {v1, v5, p0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v0, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    const-string p1, "applicationContext"

    .line 96
    .line 97
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "Failed to load shared accounts "

    .line 104
    .line 105
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v4, "ScidPlugin"

    .line 116
    .line 117
    invoke-static {v4, v1, p1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    sget-object p1, Lz80;->a:Lm60;

    .line 121
    .line 122
    sget-object p1, Lgb1;->a:Lkt0;

    .line 123
    .line 124
    new-instance v1, Lus1;

    .line 125
    .line 126
    invoke-direct {v1, v2, v6}, Lus1;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 127
    .line 128
    .line 129
    iput v3, p0, Lvs1;->a:I

    .line 130
    .line 131
    invoke-static {p1, v1, p0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, v0, :cond_6

    .line 136
    .line 137
    :goto_2
    return-object v0

    .line 138
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0
.end method

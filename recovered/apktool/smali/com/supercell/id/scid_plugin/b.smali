.class public final Lcom/supercell/id/scid_plugin/b;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/b;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/b;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/supercell/id/scid_plugin/b;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/supercell/id/scid_plugin/b;->e:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/supercell/id/scid_plugin/b;->f:Lio/flutter/plugin/common/MethodChannel$Result;

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
    new-instance v0, Lcom/supercell/id/scid_plugin/b;

    .line 2
    .line 3
    iget-object v4, p0, Lcom/supercell/id/scid_plugin/b;->e:Ljava/util/List;

    .line 4
    .line 5
    iget-object v5, p0, Lcom/supercell/id/scid_plugin/b;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/b;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/b;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/supercell/id/scid_plugin/b;->d:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/supercell/id/scid_plugin/b;-><init>(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/supercell/id/scid_plugin/b;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/supercell/id/scid_plugin/b;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/supercell/id/scid_plugin/b;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/supercell/id/scid_plugin/b;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v5

    .line 27
    :cond_1
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_1
    new-instance p1, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/b;->b:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 39
    .line 40
    invoke-static {v1}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->access$getApplicationContext$p(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;)Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    iget-object v6, p0, Lcom/supercell/id/scid_plugin/b;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v7, p0, Lcom/supercell/id/scid_plugin/b;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p1, v1, v6, v7}, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/b;->e:Ljava/util/List;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    const/16 v7, 0xa

    .line 60
    .line 61
    invoke-static {v1, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Ljava/util/Map;

    .line 83
    .line 84
    sget-object v8, Lcom/supercell/id/scid_plugin/IdAccount;->Companion:Lcom/supercell/id/scid_plugin/IdAccount$Companion;

    .line 85
    .line 86
    invoke-virtual {v8, v7}, Lcom/supercell/id/scid_plugin/IdAccount$Companion;->fromMap(Ljava/util/Map;)Lcom/supercell/id/scid_plugin/IdAccount;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    sget-object v6, Lnd0;->a:Lnd0;

    .line 95
    .line 96
    :cond_4
    invoke-virtual {p1, v6}, Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;->saveAccounts(Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, Lz80;->a:Lm60;

    .line 100
    .line 101
    sget-object p1, Lgb1;->a:Lkt0;

    .line 102
    .line 103
    new-instance v1, Lws1;

    .line 104
    .line 105
    invoke-direct {v1, v2, v5}, Lws1;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 106
    .line 107
    .line 108
    iput v4, p0, Lcom/supercell/id/scid_plugin/b;->a:I

    .line 109
    .line 110
    invoke-static {p1, v1, p0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v0, :cond_6

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    const-string p1, "applicationContext"

    .line 118
    .line 119
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 123
    :goto_1
    sget-object v1, Lz80;->a:Lm60;

    .line 124
    .line 125
    sget-object v1, Lgb1;->a:Lkt0;

    .line 126
    .line 127
    new-instance v4, Lxs1;

    .line 128
    .line 129
    invoke-direct {v4, v2, p1, v5}, Lxs1;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;Lc10;)V

    .line 130
    .line 131
    .line 132
    iput v3, p0, Lcom/supercell/id/scid_plugin/b;->a:I

    .line 133
    .line 134
    invoke-static {v1, v4, p0}, Li13;->D(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-ne p0, v0, :cond_6

    .line 139
    .line 140
    :goto_2
    return-object v0

    .line 141
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0
.end method

.class public final synthetic Lrs1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrs1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lrs1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lrs1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lrs1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Ljava/io/File;

    .line 12
    .line 13
    check-cast p2, Ljava/io/IOException;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, Lyp1;->a:Lyp1;

    .line 26
    .line 27
    if-eq p0, p1, :cond_0

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    new-instance v0, Lan2;

    .line 33
    .line 34
    const/4 v4, 0x6

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct/range {v0 .. v5}, Luh0;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :pswitch_0
    check-cast p0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 43
    .line 44
    check-cast p1, Landroid/content/Context;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Exception;

    .line 47
    .line 48
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->b(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;Ljava/lang/Exception;)Lkotlin/Unit;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_1
    check-cast p0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 54
    .line 55
    check-cast p1, Landroid/content/Context;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->c(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;Ljava/lang/String;)Lkotlin/Unit;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_2
    check-cast p0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 65
    .line 66
    check-cast p1, Landroid/content/Context;

    .line 67
    .line 68
    check-cast p2, Ljava/lang/Exception;

    .line 69
    .line 70
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->a(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;Ljava/lang/Exception;)Lkotlin/Unit;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_3
    check-cast p0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 76
    .line 77
    check-cast p1, Landroid/content/Context;

    .line 78
    .line 79
    check-cast p2, Ljava/util/List;

    .line 80
    .line 81
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->h(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;Ljava/util/List;)Lkotlin/Unit;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_4
    check-cast p0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 87
    .line 88
    check-cast p1, Landroid/content/Context;

    .line 89
    .line 90
    check-cast p2, Ljava/lang/Exception;

    .line 91
    .line 92
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->f(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;Ljava/lang/Exception;)Lkotlin/Unit;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_5
    check-cast p0, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 98
    .line 99
    check-cast p1, Landroid/content/Context;

    .line 100
    .line 101
    check-cast p2, Lkotlin/Unit;

    .line 102
    .line 103
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->g(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;Lkotlin/Unit;)Lkotlin/Unit;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

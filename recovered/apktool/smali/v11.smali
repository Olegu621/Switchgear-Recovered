.class public final synthetic Lv11;
.super Lvo0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lv11;->a:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Luo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lv11;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lrz2;

    .line 9
    .line 10
    invoke-virtual {p0}, Lrz2;->b()V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lyv2;

    .line 19
    .line 20
    iget-object v0, p0, Lyv2;->a:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v1, p0, Lyv2;->f:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p0, p0, Lyv2;->j:Lra2;

    .line 25
    .line 26
    iget-object p0, p0, Lra2;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Leq2;

    .line 29
    .line 30
    iget-object p0, p0, Leq2;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    :try_start_0
    const-string v2, "clipboard"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast v0, Landroid/content/ClipboardManager;

    .line 50
    .line 51
    invoke-static {p0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :catchall_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lwv2;

    .line 64
    .line 65
    invoke-static {p0}, Lwv2;->m(Lwv2;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_2
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lfu2;

    .line 74
    .line 75
    iget-object v0, p0, Lfu2;->a:Lo7;

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    invoke-virtual {v0}, Lo7;->dismiss()V

    .line 80
    .line 81
    .line 82
    :cond_0
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lfu2;->a:Lo7;

    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_3
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, Lsp1;

    .line 91
    .line 92
    invoke-virtual {p0}, Lsp1;->d()V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_4
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Lsp1;

    .line 101
    .line 102
    invoke-virtual {p0}, Lsp1;->d()V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_5
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 111
    .line 112
    invoke-static {p0}, Lw11;->d(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_6
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 120
    .line 121
    invoke-static {p0}, Lw11;->d(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

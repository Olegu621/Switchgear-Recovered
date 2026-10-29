.class public Lco;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lco;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lco;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lco;->a:Lco;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lzy2;Lir;)V
    .locals 13

    .line 1
    const/4 p0, 0x0

    .line 2
    sget-object v0, Lzy2;->H:Llf;

    .line 3
    .line 4
    invoke-interface {p1, v0, p0}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljr;

    .line 9
    .line 10
    sget-object v0, Lnq1;->c:Lnq1;

    .line 11
    .line 12
    sget-object v1, Ljr;->h:Llf;

    .line 13
    .line 14
    new-instance v1, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Luk1;->j()Luk1;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcl1;->a()Lcl1;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, Ljr;

    .line 33
    .line 34
    new-instance v6, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Lnq1;->d(Lty;)Lnq1;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    new-instance v9, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lnm2;->b:Lnm2;

    .line 49
    .line 50
    new-instance v1, Landroid/util/ArrayMap;

    .line 51
    .line 52
    invoke-direct {v1}, Landroid/util/ArrayMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v2, v4, Lnm2;->a:Landroid/util/ArrayMap;

    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v1, v4, v8}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    new-instance v11, Lnm2;

    .line 86
    .line 87
    invoke-direct {v11, v1}, Lnm2;-><init>(Landroid/util/ArrayMap;)V

    .line 88
    .line 89
    .line 90
    const/4 v8, -0x1

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v12, 0x0

    .line 93
    invoke-direct/range {v5 .. v12}, Ljr;-><init>(Ljava/util/ArrayList;Lnq1;ILjava/util/ArrayList;ZLnm2;Lso;)V

    .line 94
    .line 95
    .line 96
    if-eqz p0, :cond_1

    .line 97
    .line 98
    iget v8, p0, Ljr;->c:I

    .line 99
    .line 100
    iget-object v0, p0, Ljr;->d:Ljava/util/List;

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Lir;->b(Ljava/util/Collection;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Ljr;->b:Lnq1;

    .line 106
    .line 107
    :cond_1
    invoke-static {v0}, Luk1;->m(Lty;)Luk1;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iput-object p0, p2, Lir;->d:Ljava/lang/Object;

    .line 112
    .line 113
    new-instance p0, Lho;

    .line 114
    .line 115
    sget-object p0, Lho;->i:Llf;

    .line 116
    .line 117
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {p1, p0, v0}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    iput p0, p2, Lir;->a:I

    .line 132
    .line 133
    new-instance p0, Lbo;

    .line 134
    .line 135
    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    .line 136
    .line 137
    .line 138
    sget-object v0, Lho;->V:Llf;

    .line 139
    .line 140
    invoke-interface {p1, v0, p0}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 145
    .line 146
    new-instance v0, Lhr;

    .line 147
    .line 148
    invoke-direct {v0, p0}, Lhr;-><init>(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v0}, Lir;->c(Lmo;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lnr;->b(Lty;)Lnr;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    new-instance p1, Ld52;

    .line 159
    .line 160
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 161
    .line 162
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-direct {p1, p0}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p1}, Lir;->e(Lty;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.class public final Lv30;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv30;->a:Landroid/content/Context;

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lv30;->a:Landroid/content/Context;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Lw30;
    .locals 11

    .line 1
    iget-object p0, p0, Lv30;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw30;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lpg3;->a:Lec0;

    .line 11
    .line 12
    invoke-static {v1}, Lm90;->a(Lsg0;)Ljavax/inject/Provider;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lw30;->a:Ljavax/inject/Provider;

    .line 17
    .line 18
    new-instance v1, Ld1;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Ld1;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lw30;->b:Ld1;

    .line 24
    .line 25
    new-instance p0, Ld52;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lwc0;

    .line 31
    .line 32
    const/16 v3, 0x12

    .line 33
    .line 34
    invoke-direct {v2, v3, v1, p0}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lm90;->a(Lsg0;)Ljavax/inject/Provider;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iput-object p0, v0, Lw30;->c:Ljavax/inject/Provider;

    .line 42
    .line 43
    iget-object p0, v0, Lw30;->b:Ld1;

    .line 44
    .line 45
    new-instance v1, Lts0;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Lts0;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object v1, v0, Lw30;->d:Lts0;

    .line 51
    .line 52
    new-instance v1, Lqc3;

    .line 53
    .line 54
    const/16 v2, 0x18

    .line 55
    .line 56
    invoke-direct {v1, p0, v2}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lm90;->a(Lsg0;)Ljavax/inject/Provider;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iput-object p0, v0, Lw30;->e:Ljavax/inject/Provider;

    .line 64
    .line 65
    iget-object v1, v0, Lw30;->d:Lts0;

    .line 66
    .line 67
    new-instance v2, Lwc0;

    .line 68
    .line 69
    const/16 v3, 0x1d

    .line 70
    .line 71
    invoke-direct {v2, v3, v1, p0}, Lwc0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Lm90;->a(Lsg0;)Ljavax/inject/Provider;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    iput-object v8, v0, Lw30;->f:Ljavax/inject/Provider;

    .line 79
    .line 80
    new-instance p0, Lp62;

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    invoke-direct {p0, v1}, Lp62;-><init>(I)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Lw30;->b:Ld1;

    .line 87
    .line 88
    new-instance v7, Lac1;

    .line 89
    .line 90
    const/16 v2, 0xa

    .line 91
    .line 92
    invoke-direct {v7, v2, v1, v8, p0}, Lac1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v5, v0, Lw30;->a:Ljavax/inject/Provider;

    .line 96
    .line 97
    iget-object v6, v0, Lw30;->c:Ljavax/inject/Provider;

    .line 98
    .line 99
    new-instance v4, Lb5;

    .line 100
    .line 101
    const/4 v10, 0x4

    .line 102
    move-object v9, v8

    .line 103
    invoke-direct/range {v4 .. v10}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    new-instance p0, Leq2;

    .line 107
    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v1, p0, Leq2;->a:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v6, p0, Leq2;->b:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v8, p0, Leq2;->c:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v7, p0, Leq2;->d:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v5, p0, Leq2;->e:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v8, p0, Leq2;->f:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v8, p0, Leq2;->i:Ljava/lang/Object;

    .line 124
    .line 125
    new-instance v1, Lra2;

    .line 126
    .line 127
    invoke-direct {v1, v5, v8, v7, v8}, Lra2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance v2, Lac1;

    .line 131
    .line 132
    const/16 v3, 0x14

    .line 133
    .line 134
    invoke-direct {v2, v3, v4, p0, v1}, Lac1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v2}, Lm90;->a(Lsg0;)Ljavax/inject/Provider;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    iput-object p0, v0, Lw30;->i:Ljavax/inject/Provider;

    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    const-class v0, Landroid/content/Context;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v0, " must be set"

    .line 161
    .line 162
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p0
.end method

.method public b(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lv30;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p2, p1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lv30;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p2, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lv30;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lpy0;->p0(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-static {}, Lj13;->l()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0, v0}, Lwt0;->y(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    return p0
.end method

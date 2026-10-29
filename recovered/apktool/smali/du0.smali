.class public final Ldu0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lrs0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lrs0;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldu0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldu0;->b:Lrs0;

    .line 4
    .line 5
    iput-object p2, p0, Ldu0;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ldu0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldu0;->b:Lrs0;

    .line 7
    .line 8
    iget-object v0, v0, Lrs0;->e:Liy;

    .line 9
    .line 10
    iget-object p0, p0, Ldu0;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, v0, Liy;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ler0;

    .line 15
    .line 16
    const-string v1, "language"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Ldu0;->b:Lrs0;

    .line 23
    .line 24
    iget-object v0, v0, Lrs0;->e:Liy;

    .line 25
    .line 26
    iget-object p0, p0, Ldu0;->c:Ljava/lang/String;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 30
    .line 31
    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    .line 32
    .line 33
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 34
    .line 35
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/Date;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, v0, Liy;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ler0;

    .line 50
    .line 51
    invoke-virtual {v2}, Ler0;->i()Lorg/json/JSONArray;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/16 v4, 0x1388

    .line 60
    .line 61
    if-le v3, v4, :cond_0

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_4

    .line 71
    :catch_0
    move-exception p0

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance v3, Lorg/json/JSONObject;

    .line 78
    .line 79
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v4, "a"

    .line 83
    .line 84
    invoke-virtual {v3, v4, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    const-string p0, "d"

    .line 88
    .line 89
    invoke-virtual {v3, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    const/16 v1, 0x64

    .line 100
    .line 101
    if-le p0, v1, :cond_2

    .line 102
    .line 103
    sub-int/2addr p0, v1

    .line 104
    new-instance v3, Lorg/json/JSONArray;

    .line 105
    .line 106
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 107
    .line 108
    .line 109
    :goto_1
    if-gt p0, v1, :cond_1

    .line 110
    .line 111
    invoke-virtual {v2, p0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 116
    .line 117
    .line 118
    add-int/lit8 p0, p0, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    move-object v2, v3

    .line 122
    :cond_2
    iget-object p0, v0, Liy;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p0, Ler0;

    .line 125
    .line 126
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {v1}, Lb40;->p(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_3

    .line 138
    .line 139
    new-instance v1, Lorg/json/JSONArray;

    .line 140
    .line 141
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_3
    const-string v2, "breadcrumbs"

    .line 149
    .line 150
    invoke-virtual {p0, v2, v1}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :goto_2
    :try_start_1
    const-string v1, "ConfigMangr"

    .line 155
    .line 156
    const-string v2, "Error pushing BreadCrumbs"

    .line 157
    .line 158
    invoke-static {v1, v2, p0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    .line 160
    .line 161
    :goto_3
    monitor-exit v0

    .line 162
    return-void

    .line 163
    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    throw p0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

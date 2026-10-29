.class public final Lif0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final a:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lif0;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 9
    .line 10
    return-void
.end method

.method public static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-le v0, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p0, v0

    .line 11
    :goto_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    new-array v1, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "if0"

    .line 11
    .line 12
    const-string v3, "Uncaught exception being tracked..."

    .line 13
    .line 14
    invoke-static {v2, v3, v1}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/16 v2, 0x800

    .line 22
    .line 23
    invoke-static {v2, v1}, Lif0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    :cond_0
    const-string v1, "Android Exception. Null or empty message found"

    .line 36
    .line 37
    :cond_1
    sget v2, Lmn0;->p:I

    .line 38
    .line 39
    new-instance v2, Ljava/io/StringWriter;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v3, Ljava/io/PrintWriter;

    .line 45
    .line 46
    invoke-direct {v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const/16 v3, 0x1fa0

    .line 60
    .line 61
    invoke-static {v3, v2}, Lif0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/16 v4, 0x400

    .line 70
    .line 71
    invoke-static {v4, v3}, Lif0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    array-length v5, v5

    .line 83
    const/4 v6, 0x0

    .line 84
    if-nez v5, :cond_2

    .line 85
    .line 86
    move-object v0, v6

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    aget-object v0, v5, v0

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-gez v5, :cond_3

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    move-object v6, v7

    .line 106
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v4, v0}, Lif0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-static {v4, v5}, Lif0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    new-instance v5, Ljava/util/HashMap;

    .line 127
    .line 128
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v7, "message"

    .line 132
    .line 133
    invoke-static {v5, v7, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const-string v1, "stackTrace"

    .line 137
    .line 138
    invoke-static {v5, v1, v2}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    const-string v1, "threadName"

    .line 142
    .line 143
    invoke-static {v5, v1, v3}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const-string v2, "threadId"

    .line 155
    .line 156
    invoke-static {v5, v2, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const-string v1, "programmingLanguage"

    .line 160
    .line 161
    const-string v2, "JAVA"

    .line 162
    .line 163
    invoke-static {v5, v1, v2}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const-string v1, "lineNumber"

    .line 167
    .line 168
    invoke-static {v5, v1, v6}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    const-string v1, "className"

    .line 172
    .line 173
    invoke-static {v5, v1, v0}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    const-string v0, "exceptionName"

    .line 177
    .line 178
    invoke-static {v5, v0, v4}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    const-string v0, "isFatal"

    .line 182
    .line 183
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-static {v5, v0, v1}, Lmn0;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, La92;

    .line 189
    .line 190
    new-instance v1, Lb92;

    .line 191
    .line 192
    const-string v2, "iglu:com.snowplowanalytics.snowplow/application_error/jsonschema/1-0-0"

    .line 193
    .line 194
    invoke-direct {v1, v2, v5}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-direct {v0, v1}, La92;-><init>(Lb92;)V

    .line 198
    .line 199
    .line 200
    new-instance v1, Ljava/util/HashMap;

    .line 201
    .line 202
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 203
    .line 204
    .line 205
    const-string v2, "event"

    .line 206
    .line 207
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    const-string v0, "SnowplowCrashReporting"

    .line 211
    .line 212
    invoke-static {v0, v1}, Lxn1;->b(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 213
    .line 214
    .line 215
    iget-object p0, p0, Lif0;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 216
    .line 217
    if-eqz p0, :cond_4

    .line 218
    .line 219
    invoke-interface {p0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    :cond_4
    return-void
.end method

.class public final Lio/sentry/instrumentation/file/g;
.super Ljava/io/FileOutputStream;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/io/FileOutputStream;

.field public final b:Lio/sentry/instrumentation/file/b;


# direct methods
.method public constructor <init>(Lio/sentry/instrumentation/file/c;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lio/sentry/instrumentation/file/c;->d:Ljava/io/Closeable;

    .line 2
    .line 3
    check-cast v0, Ljava/io/FileOutputStream;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    invoke-direct {p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lio/sentry/instrumentation/file/b;

    .line 13
    .line 14
    iget-object v2, p1, Lio/sentry/instrumentation/file/c;->b:Lio/sentry/k1;

    .line 15
    .line 16
    iget-object v3, p1, Lio/sentry/instrumentation/file/c;->a:Ljava/io/File;

    .line 17
    .line 18
    iget-object p1, p1, Lio/sentry/instrumentation/file/c;->c:Lio/sentry/m6;

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, p1}, Lio/sentry/instrumentation/file/b;-><init>(Lio/sentry/k1;Ljava/io/File;Lio/sentry/m6;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lio/sentry/instrumentation/file/g;->b:Lio/sentry/instrumentation/file/b;

    .line 24
    .line 25
    iput-object v0, p0, Lio/sentry/instrumentation/file/g;->a:Ljava/io/FileOutputStream;

    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 29
    .line 30
    const-string p1, "No file descriptor"

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public constructor <init>(Lio/sentry/instrumentation/file/c;Ljava/io/FileDescriptor;)V
    .locals 3

    .line 36
    invoke-direct {p0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 37
    new-instance p2, Lio/sentry/instrumentation/file/b;

    iget-object v0, p1, Lio/sentry/instrumentation/file/c;->b:Lio/sentry/k1;

    iget-object v1, p1, Lio/sentry/instrumentation/file/c;->a:Ljava/io/File;

    iget-object v2, p1, Lio/sentry/instrumentation/file/c;->c:Lio/sentry/m6;

    invoke-direct {p2, v0, v1, v2}, Lio/sentry/instrumentation/file/b;-><init>(Lio/sentry/k1;Ljava/io/File;Lio/sentry/m6;)V

    iput-object p2, p0, Lio/sentry/instrumentation/file/g;->b:Lio/sentry/instrumentation/file/b;

    .line 38
    iget-object p1, p1, Lio/sentry/instrumentation/file/c;->d:Ljava/io/Closeable;

    check-cast p1, Ljava/io/FileOutputStream;

    iput-object p1, p0, Lio/sentry/instrumentation/file/g;->a:Ljava/io/FileOutputStream;

    return-void
.end method

.method public static c(Ljava/io/File;Ljava/io/FileOutputStream;Z)Lio/sentry/instrumentation/file/c;
    .locals 2

    .line 1
    sget-boolean p2, Lio/sentry/util/k;->a:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p2}, Lio/sentry/c1;->m()Lio/sentry/m1;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, Lio/sentry/c1;->g()Lio/sentry/k1;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    if-eqz p2, :cond_1

    .line 23
    .line 24
    const-string v0, "file.write"

    .line 25
    .line 26
    invoke-interface {p2, v0}, Lio/sentry/k1;->p(Ljava/lang/String;)Lio/sentry/k1;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 p2, 0x0

    .line 32
    :goto_1
    new-instance v0, Lio/sentry/instrumentation/file/c;

    .line 33
    .line 34
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, p0, p2, p1, v1}, Lio/sentry/instrumentation/file/c;-><init>(Ljava/io/File;Lio/sentry/k1;Ljava/io/Closeable;Lio/sentry/m6;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/instrumentation/file/g;->b:Lio/sentry/instrumentation/file/b;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/instrumentation/file/g;->a:Ljava/io/FileOutputStream;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lio/sentry/instrumentation/file/b;->a(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/io/FileOutputStream;->close()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 18
    new-instance v0, Lio/sentry/instrumentation/file/f;

    invoke-direct {v0, p0, p1}, Lio/sentry/instrumentation/file/f;-><init>(Lio/sentry/instrumentation/file/g;I)V

    iget-object p0, p0, Lio/sentry/instrumentation/file/g;->b:Lio/sentry/instrumentation/file/b;

    invoke-virtual {p0, v0}, Lio/sentry/instrumentation/file/b;->c(Lio/sentry/instrumentation/file/a;)Ljava/lang/Object;

    return-void
.end method

.method public final write([B)V
    .locals 2

    .line 17
    new-instance v0, Lpn;

    const/16 v1, 0x1c

    invoke-direct {v0, v1, p0, p1}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p0, p0, Lio/sentry/instrumentation/file/g;->b:Lio/sentry/instrumentation/file/b;

    invoke-virtual {p0, v0}, Lio/sentry/instrumentation/file/b;->c(Lio/sentry/instrumentation/file/a;)Ljava/lang/Object;

    return-void
.end method

.method public final write([BII)V
    .locals 6

    .line 1
    new-instance v0, Lio/sentry/instrumentation/file/d;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lio/sentry/instrumentation/file/d;-><init>(Ljava/io/Closeable;[BIII)V

    .line 9
    .line 10
    .line 11
    iget-object p0, v1, Lio/sentry/instrumentation/file/g;->b:Lio/sentry/instrumentation/file/b;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lio/sentry/instrumentation/file/b;->c(Lio/sentry/instrumentation/file/a;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

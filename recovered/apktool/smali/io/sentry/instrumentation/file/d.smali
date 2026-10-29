.class public final synthetic Lio/sentry/instrumentation/file/d;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/instrumentation/file/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:[B

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/io/Closeable;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Closeable;[BIII)V
    .locals 0

    .line 1
    iput p5, p0, Lio/sentry/instrumentation/file/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/instrumentation/file/d;->e:Ljava/io/Closeable;

    .line 4
    .line 5
    iput-object p2, p0, Lio/sentry/instrumentation/file/d;->b:[B

    .line 6
    .line 7
    iput p3, p0, Lio/sentry/instrumentation/file/d;->c:I

    .line 8
    .line 9
    iput p4, p0, Lio/sentry/instrumentation/file/d;->d:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lio/sentry/instrumentation/file/d;->a:I

    .line 2
    .line 3
    iget v1, p0, Lio/sentry/instrumentation/file/d;->d:I

    .line 4
    .line 5
    iget v2, p0, Lio/sentry/instrumentation/file/d;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/instrumentation/file/d;->b:[B

    .line 8
    .line 9
    iget-object p0, p0, Lio/sentry/instrumentation/file/d;->e:Ljava/io/Closeable;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lio/sentry/instrumentation/file/g;

    .line 15
    .line 16
    iget-object p0, p0, Lio/sentry/instrumentation/file/g;->a:Ljava/io/FileOutputStream;

    .line 17
    .line 18
    invoke-virtual {p0, v3, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p0, Lio/sentry/instrumentation/file/e;

    .line 27
    .line 28
    iget-object p0, p0, Lio/sentry/instrumentation/file/e;->a:Ljava/io/FileInputStream;

    .line 29
    .line 30
    invoke-virtual {p0, v3, v2, v1}, Ljava/io/FileInputStream;->read([BII)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

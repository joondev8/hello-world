# Hello World API Documentation

## Endpoints

### GET /api/hello

Returns a greeting message.

**Parameters:**
- `name` (optional, string): The name to greet. Default: "World"

**Response:**
```json
{
  "message": "Hello {name}!"
}
```

**Examples:**

```bash
# Default greeting
curl http://localhost:8080/api/hello

# Custom greeting
curl http://localhost:8080/api/hello?name=John
```

**Response Example:**
```json
{
  "message": "Hello John!"
}
```
